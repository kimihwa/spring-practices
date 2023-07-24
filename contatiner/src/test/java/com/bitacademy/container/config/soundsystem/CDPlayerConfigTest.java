package com.bitacademy.container.config.soundsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.bitacademy.container.soundsystem.CDPlayer;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= {CDPlayerconfig.class})
public class CDPlayerConfigTest {
	@Autowired
	private CDPlayer cdplayer;
	
	@Test
	public void testCDPlayerNotNULL() {
		assertNotNull(cdplayer);
	}
	@Test
	public void testPlay() {
		assertEquals("Playing 붕붕 by 김하온", cdplayer.play());
	}
}
