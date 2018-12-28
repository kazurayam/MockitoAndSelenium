package com.example.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.example.dao.FruitsDao;
import com.example.dto.FruitsDto;

public class FruitsServiceTest {
    
    @Test
    public void test() {
        FruitsDao mockDao = mock(FruitsDao.class);
        when(mockDao.selectById(anyInt())).thenReturn(new FruitsDto(1, "apple", 100));
        FruitsService sut = new FruitsService();
        sut.setFruitsDao(mockDao);
        boolean actual = sut.isExist(1);
        assertThat(actual).isTrue();
        verify(mockDao).selectById(1);
    }

}
