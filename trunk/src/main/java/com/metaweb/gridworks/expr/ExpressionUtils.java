package com.metaweb.gridworks.expr;

import java.util.Properties;

import com.metaweb.gridworks.model.Cell;
import com.metaweb.gridworks.model.Project;
import com.metaweb.gridworks.model.Row;

public class ExpressionUtils {
    static public Properties createBindings(Project project) {
        Properties bindings = new Properties();
        bindings.put("project", project);
        return bindings;
    }
    
    static public void bind(Properties bindings, Row row, Cell cell) {
        bindings.put("row", row);
        bindings.put("cells", row.getField("cells", bindings));
        
        bindings.put("cell", cell);
        bindings.put("value", cell.value);
    }
}
