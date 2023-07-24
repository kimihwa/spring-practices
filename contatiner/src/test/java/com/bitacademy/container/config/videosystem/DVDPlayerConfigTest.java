package com.bitacademy.container.config.videosystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.bitacademy.container.videosystem.DVDPlayer;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes={DVDPlayerConfig.class})
public class DVDPlayerConfigTest {
	@Autowired
	@Qualifier("dvdPlayer01")
	private DVDPlayer dvdPlayer01;
	
	@Autowired
	@Qualifier("dvdPlayer02")
	private DVDPlayer dvdPlayer02;
	
	@Test
	public void testDVDPlayerNotNull() {
		assertNotNull(dvdPlayer01);
	}
	
	@Test
	public void testPlay01() {
		assertEquals("Playing Movie MARVEL's Avengers", dvdPlayer01.play());
	}
	
	@Test
	public void testPlay02() {
		assertEquals("Playing Movie MARVEL's Avengers", dvdPlayer02.play());
	}
}