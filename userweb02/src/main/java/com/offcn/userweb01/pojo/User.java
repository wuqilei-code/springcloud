package com.offcn.userweb01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    private long id;
    private String name;
    private int age;

}
