package com.example.userservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Abstract class that centralizes the path prefix "/user-service/v1"
 * for controller classes that extend RootController.
 */
@RequestMapping(path = "/user-service/v1")
public class RootController {
}
