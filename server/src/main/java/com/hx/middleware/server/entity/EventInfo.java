package com.hx.middleware.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author jxlgcmh
 * @date 2020-02-09 20:15
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EventInfo implements Serializable {
    private Integer id;
    private String module;
    private String name;
    private String desc;
}
