package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;

public interface Album extends Product {

    String getArtist();

    Duration getPlayingTime();

}
