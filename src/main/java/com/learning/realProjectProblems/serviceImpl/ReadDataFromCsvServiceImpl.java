package com.learning.realProjectProblems.serviceImpl;

import com.learning.realProjectProblems.dto.ProductDTO;
import com.learning.realProjectProblems.service.ReadDataFromCsvService;

import org.springframework.stereotype.Service;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
public class ReadDataFromCsvServiceImpl implements ReadDataFromCsvService {

    public List<ProductDTO> getCsvContent(String fileName) {
        try (Reader reader = Files.newBufferedReader(Paths.get(fileName))) {
            ColumnPositionMappingStrategy<ProductDTO> columnPositionMappingStrategy = new ColumnPositionMappingStrategy<>();
            columnPositionMappingStrategy.setType(ProductDTO.class);
            String[] memberFieldToBindTO = {"product_id", "name", "price", "quantity"};
            columnPositionMappingStrategy.setColumnMapping(memberFieldToBindTO);
            CsvToBean<ProductDTO> csvToBean = new CsvToBeanBuilder<ProductDTO>(reader)
                    .withMappingStrategy(columnPositionMappingStrategy)
                    .withSkipLines(1)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<ProductDTO> products = csvToBean.parse();
            return products;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public int getFilteredPrice() {
        String fileName = "src/main/java/com/learning/realProjectProblems/utils/product.csv";
        List<ProductDTO> products = getCsvContent(fileName);

        return products.stream()
                        .filter(ele -> Double.parseDouble(ele.getPrice()) <100)
                .map(ele -> Integer.valueOf(ele.getQuantity())).reduce(0,Integer::sum);

    }
}

