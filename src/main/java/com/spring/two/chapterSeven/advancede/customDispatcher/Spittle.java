package com.spring.two.chapterSeven.advancede.customDispatcher;

import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

/**
 * 程序清单5.8 Spittle类：包含消息内容、时间戳和位置信息
 */
public class Spittle {

    private final Long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longittude;

    public Spittle(String message, Date time) {
        this(message, time, null, null);
    }

    public Spittle(String message, Date time, Double latitude, Double longittude) {
        this.id = null;
        this.message = message;
        this.time = time;
        this.latitude = latitude;
        this.longittude = longittude;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongittude() {
        return longittude;
    }


    //Apache Commons Lang
    @Override
    public boolean equals(Object that) {
        return org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals(this, that, "id", "time");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }
}