package com.softserve.edu14.hw.task1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static java.time.Month.*;

class TestFilter {
    @Test
    void testFilterAndSort(){
        List<Product> products = Arrays.asList(
                new Product(ManufactureCategory.COMPUTER, LocalDate.of(2020, JANUARY, 1), 5513),
                new Product(ManufactureCategory.PHONE, LocalDate.of(2022, FEBRUARY, 2), 1243),
                new Product(ManufactureCategory.COMPUTER, LocalDate.of(2023, APRIL, 3), 5513),
                new Product(ManufactureCategory.PHONE, LocalDate.of(2023, JUNE, 4), 4000),
                new Product(ManufactureCategory.HEADPHONES, LocalDate.of(2023, MAY, 5), 3333),
                new Product(ManufactureCategory.PHONE, LocalDate.of(2021, JULY, 6), 5693),
                new Product(ManufactureCategory.PHONE, LocalDate.of(2022, JUNE, 4), 3102),
                new Product(ManufactureCategory.PHONE, LocalDate.of(2021, DECEMBER, 5), 3450),
                new Product(ManufactureCategory.PRINTER, LocalDate.of(2021, MARCH, 5), 1251),
                new Product(ManufactureCategory.HEADPHONES, LocalDate.of(2022, MAY, 8), 5546),
                new Product(ManufactureCategory.PRINTER, LocalDate.of(2020, JANUARY, 5), 9653),
                new Product(ManufactureCategory.COMPUTER, LocalDate.of(2022, JUNE, 6), 1246),
                new Product(ManufactureCategory.HEADPHONES, LocalDate.of(2020, FEBRUARY, 5), 3216),
                new Product(ManufactureCategory.HEADPHONES, LocalDate.of(2023, AUGUST, 5), 3468),
                new Product(ManufactureCategory.PHONE, LocalDate.of(2023, AUGUST, 6), 4563),
                new Product(ManufactureCategory.PRINTER, LocalDate.of(2023, OCTOBER, 3), 1346),
                new Product(ManufactureCategory.PRINTER, LocalDate.of(2022, APRIL, 6), 5555),
                new Product(ManufactureCategory.COMPUTER, LocalDate.of(2020, SEPTEMBER, 5), 4513),
                new Product(ManufactureCategory.PHONE, LocalDate.of(2023, DECEMBER,6), 2395),
                new Product(ManufactureCategory.PHONE, LocalDate.of(2019, NOVEMBER,5), 3021)
        );

        List<Product> expectedList = Arrays.asList(
                new Product(ManufactureCategory.PHONE, LocalDate.of(2019, NOVEMBER,5), 3021),
                new Product(ManufactureCategory.PHONE, LocalDate.of(2022, JUNE, 4), 3102),
                new Product(ManufactureCategory.PHONE, LocalDate.of(2021, DECEMBER, 5), 3450),
                new Product(ManufactureCategory.PHONE, LocalDate.of(2021, JULY, 6), 5693)
        );

        var actual = Main.filterAndSortList(products);

        Assertions.assertThat(actual)
                .isNotNull()
                .isNotEmpty()
                .hasSize(expectedList.size())
                .containsOnlyOnceElementsOf(expectedList);
    }
}
