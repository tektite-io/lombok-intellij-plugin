// Generated by delombok at Fri Jun 10 17:38:17 CEST 2016
package de.plushnikov.builder.generic.guava;

import com.google.common.collect.ImmutableSet;

public class SingularGuavaSet2<T> {
  private ImmutableSet rawTypes;
  private ImmutableSet<Integer> integers;
  private ImmutableSet<T> generics;
  private ImmutableSet<? extends Number> extendsGenerics;

  public static void main(String[] args) {
  }

  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  SingularGuavaSet2(final ImmutableSet rawTypes, final ImmutableSet<Integer> integers, final ImmutableSet<T> generics, final ImmutableSet<? extends Number> extendsGenerics) {
    this.rawTypes = rawTypes;
    this.integers = integers;
    this.generics = generics;
    this.extendsGenerics = extendsGenerics;
  }


  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public static class SingularGuavaSetBuilder<T> {
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private com.google.common.collect.ImmutableSet.Builder<java.lang.Object> rawTypes;
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private com.google.common.collect.ImmutableSet.Builder<Integer> integers;
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private com.google.common.collect.ImmutableSet.Builder<T> generics;
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    private com.google.common.collect.ImmutableSet.Builder<Number> extendsGenerics;

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    SingularGuavaSetBuilder() {
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSetBuilder<T> rawType(final java.lang.Object rawType) {
      if (this.rawTypes == null) this.rawTypes = com.google.common.collect.ImmutableSet.builder();
      this.rawTypes.add(rawType);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSetBuilder<T> rawTypes(final java.lang.Iterable<?> rawTypes) {
      if (this.rawTypes == null) this.rawTypes = com.google.common.collect.ImmutableSet.builder();
      this.rawTypes.addAll(rawTypes);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSetBuilder<T> clearRawTypes() {
      this.rawTypes = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSetBuilder<T> integer(final Integer integer) {
      if (this.integers == null) this.integers = com.google.common.collect.ImmutableSet.builder();
      this.integers.add(integer);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSetBuilder<T> integers(final java.lang.Iterable<? extends Integer> integers) {
      if (this.integers == null) this.integers = com.google.common.collect.ImmutableSet.builder();
      this.integers.addAll(integers);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSetBuilder<T> clearIntegers() {
      this.integers = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSetBuilder<T> generic(final T generic) {
      if (this.generics == null) this.generics = com.google.common.collect.ImmutableSet.builder();
      this.generics.add(generic);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSetBuilder<T> generics(final java.lang.Iterable<? extends T> generics) {
      if (this.generics == null) this.generics = com.google.common.collect.ImmutableSet.builder();
      this.generics.addAll(generics);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSetBuilder<T> clearGenerics() {
      this.generics = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSetBuilder<T> extendsGeneric(final Number extendsGeneric) {
      if (this.extendsGenerics == null) this.extendsGenerics = com.google.common.collect.ImmutableSet.builder();
      this.extendsGenerics.add(extendsGeneric);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSetBuilder<T> extendsGenerics(final java.lang.Iterable<? extends Number> extendsGenerics) {
      if (this.extendsGenerics == null) this.extendsGenerics = com.google.common.collect.ImmutableSet.builder();
      this.extendsGenerics.addAll(extendsGenerics);
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSetBuilder<T> clearExtendsGenerics() {
      this.extendsGenerics = null;
      return this;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public SingularGuavaSet2<T> build() {
      com.google.common.collect.ImmutableSet<java.lang.Object> rawTypes = this.rawTypes == null ? com.google.common.collect.ImmutableSet.<java.lang.Object>of() : this.rawTypes.build();
      com.google.common.collect.ImmutableSet<Integer> integers = this.integers == null ? com.google.common.collect.ImmutableSet.<Integer>of() : this.integers.build();
      com.google.common.collect.ImmutableSet<T> generics = this.generics == null ? com.google.common.collect.ImmutableSet.<T>of() : this.generics.build();
      com.google.common.collect.ImmutableSet<Number> extendsGenerics = this.extendsGenerics == null ? com.google.common.collect.ImmutableSet.<Number>of() : this.extendsGenerics.build();
      return new SingularGuavaSet2<T>(rawTypes, integers, generics, extendsGenerics);
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public java.lang.String toString() {
      return "SingularGuavaSet2.SingularGuavaSetBuilder(rawTypes=" + this.rawTypes + ", integers=" + this.integers + ", generics=" + this.generics + ", extendsGenerics=" + this.extendsGenerics + ")";
    }
  }

  @java.lang.SuppressWarnings("all")
  @javax.annotation.Generated("lombok")
  public static <T> SingularGuavaSetBuilder<T> builder() {
    return new SingularGuavaSetBuilder<T>();
  }
}