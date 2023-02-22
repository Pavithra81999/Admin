package com.extended;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AdminApplicationTests {

	@Mock
	private AdminApplication adminApplication;

	@Test
	void contextLoads() {
	}

	@Test
	public void AdminApplicationTests() {
		assertThat(adminApplication).isNotNull();
	}
}
