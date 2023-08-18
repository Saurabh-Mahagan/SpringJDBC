package org.example.dao;

import org.example.doman.Project;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class ProjectDeo {
private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public ProjectDeo(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }
private final String SQL_FOR_PROJECT="INSERT INTO PROJECT VALUES(:projectNo,:title,:description,:duration,:status)";
    public int insertProjects(Project project){
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("projectNo",project.getProjectNo());
        parameterSource.addValue("title",project.getTitle());
        parameterSource.addValue("description",project.getDescription());
        parameterSource.addValue("duration",project.getDuration());
        parameterSource.addValue("status",project.getStatus());
        int rowCount=namedParameterJdbcTemplate.update(SQL_FOR_PROJECT,parameterSource);
    return rowCount;
    }
}
