package org.usd232.robotics.autumofintakes.log;

@FunctionalInterface
public interface UnsafeFunction<T> {
    T run() throws Throwable;
}
