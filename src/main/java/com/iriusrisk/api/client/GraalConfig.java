package com.iriusrisk.api.client;

import nativeimage.Reflection;

/*
 Need this annotation to generate the reflection configuration needed by GraalVM.
 It has no effect for using with pure Java
 */
@Reflection(declaredConstructors = true, declaredFields = true, scanPackage = "com.iriusrisk.api")
public class GraalConfig {
}
