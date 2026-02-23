package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.d0.C0048;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class l extends ArrayList {
    public final m a;

    public l(m mVar, int i) {
        super(i);
        this.a = mVar;
    }

    public final void a() {
        C0030.m5441(this).e = null;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        C0048.m7942(this);
        super.add(i, obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        C0048.m7942(this);
        return super.add(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        C0048.m7942(this);
        return super.addAll(i, collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        C0048.m7942(this);
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        C0048.m7942(this);
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        C0048.m7942(this);
        return super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        C0048.m7942(this);
        return super.remove(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        C0048.m7942(this);
        return super.removeAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public final void removeRange(int i, int i2) {
        C0048.m7942(this);
        super.removeRange(i, i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        C0048.m7942(this);
        return super.retainAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C0048.m7942(this);
        return super.set(i, obj);
    }
}