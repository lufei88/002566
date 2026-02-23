package com.github.catvod.spider.p000mergexbpq.a0;

import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class a<E> extends ArrayList<E> {
    public a(int i) {
        super(i);
    }

    public abstract void a();

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        C0016.m3512(this);
        super.add(i, e);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        C0016.m3512(this);
        return super.add(e);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        C0016.m3512(this);
        return super.addAll(i, collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        C0016.m3512(this);
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        C0016.m3512(this);
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        C0016.m3512(this);
        return (E) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        C0016.m3512(this);
        return super.remove(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        C0016.m3512(this);
        return super.removeAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        C0016.m3512(this);
        super.removeRange(i, i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        C0016.m3512(this);
        return super.retainAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        C0016.m3512(this);
        return (E) super.set(i, e);
    }
}