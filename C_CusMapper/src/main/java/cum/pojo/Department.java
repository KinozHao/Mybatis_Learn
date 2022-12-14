package cum.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/11/19 17:01
 * @apiNote
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Department {
    private Integer d_id;
    private String d_name;
    //一对多
    private List<Employee> emps;
}
