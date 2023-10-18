package com.softserve.edu09.pt.task1;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TestDynamicArray {
    private List<HeavyBox> boxes;

    @BeforeEach
    void createBoxList(){
        boxes = new ArrayList<>();
        boxes.add(new HeavyBox(15, "Test1"));
        boxes.add(new HeavyBox(23, "Kyiv"));
        boxes.add(new HeavyBox(10, "IT"));
        boxes.add(new HeavyBox(2, "London"));
    }

    @Test
    void testChangeWeightInFirstElementBoxes(){
        boxes.get(0).setWeight(1);

        assertThat(boxes.get(0).getWeight())
                .isEqualTo(1);
    }

    @Test
    void testDeleteLastElementInBoxes(){
        int lengthList = boxes.size();
        HeavyBox buffer = new HeavyBox(boxes.get(lengthList - 1));

        boxes.remove(lengthList - 1);

        assertThat(boxes)
                .hasSize(lengthList - 1)
                .last()
                .isNotSameAs(buffer);
    }

    @Test
    void testDeleteAllElementsInBoxes(){
        boxes.clear();

        assertThat(boxes)
                .hasSize(0);
    }
}
