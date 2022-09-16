package org.usd232.robotics.autumnofintakes.log;

@FunctionalInterface
public interface UnsafeFunction<T> {
    T run() throws Throwable;
}
