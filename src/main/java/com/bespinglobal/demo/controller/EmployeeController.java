package com.bespinglobal.demo.controller;

import com.bespinglobal.demo.response.ApiResponseDto;
import com.bespinglobal.demo.service.EmployeeService;
import com.bespinglobal.demo.service.dto.EmployeeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Project : demo
 * Class : com.bespinglobal.demo.controller.EmployeeController
 * Version : 2019.07.17 v0.1
 * Created by taehyoung.yim on 2019-07-17.
 * *** 저작권 주의 ***
 */
@RestController
@RequestMapping("employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
    public String getHealthCheck() {
        return "{ \"isWorking\" : true }";
    }

    @GetMapping
    public ApiResponseDto<EmployeeDto.ResponseList> findAll() {
        return ApiResponseDto.createOK(new EmployeeDto.ResponseList(employeeService.findAll()));
    }

    @GetMapping("{id}")
    public ApiResponseDto<EmployeeDto.ResponseOne> findById(@PathVariable("id") String id) {
        return ApiResponseDto.createOK(new EmployeeDto.ResponseOne(employeeService.findById(id)));
    }

    @PostMapping
    public ApiResponseDto<EmployeeDto.ResponseOne> add(@RequestBody @Valid EmployeeDto.Create create) {
        return ApiResponseDto.createOK(new EmployeeDto.ResponseOne(employeeService.add(create)));
    }

    @DeleteMapping("{id}")
    public ApiResponseDto delete(@PathVariable("id") String id) {
        employeeService.delete(id);
        return ApiResponseDto.DEFAULT_OK;
    }

    @PutMapping("{id}")
    public ApiResponseDto<EmployeeDto.ResponseOne> update(@PathVariable("id") String id, @Valid @RequestBody EmployeeDto.Update update) {
        return ApiResponseDto.createOK(new EmployeeDto.ResponseOne(employeeService.update(id, update)));
    }
}
