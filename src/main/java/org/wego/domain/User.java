package org.wego.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     *
     */
    private Object no;

    /**
     *
     */
    private String name;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
