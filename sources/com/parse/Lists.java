package com.parse;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
abstract class Lists {

    public static class Partition<T> extends AbstractList<List<T>> {
        private final List<T> list;
        private final int size;

        public Partition(List<T> list, int i) {
            this.list = list;
            this.size = i;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> get(int i) {
            int i2 = this.size;
            int i3 = i * i2;
            return this.list.subList(i3, Math.min(i2 + i3, this.list.size()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return (int) Math.ceil(this.list.size() / this.size);
        }
    }

    public static <T> List<List<T>> partition(List<T> list, int i) {
        return new Partition(list, i);
    }
}
