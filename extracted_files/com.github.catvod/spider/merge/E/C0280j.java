package com.github.catvod.spider.merge.e;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.e.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280j implements Collection {
    public final /* synthetic */ C0271a a;

    public C0280j(C0271a c0271a) {
        this.a = c0271a;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        C0060.m9314(C0018.m3950(this));
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return C0023.m4585(C0018.m3950(this), obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator itM1943 = C0008.m1943(collection);
        while (C0012.m2962(itM1943)) {
            if (!C0035.m6147(this, C0048.m7949(itM1943))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return C0022.m4406(C0018.m3950(this)) == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0277g(C0018.m3950(this), 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0271a c0271aM3950 = C0018.m3950(this);
        int iM4585 = C0023.m4585(c0271aM3950, obj);
        if (iM4585 < 0) {
            return false;
        }
        C0047.m7836(c0271aM3950, iM4585);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0271a c0271aM3950 = C0018.m3950(this);
        int iM4406 = C0022.m4406(c0271aM3950);
        int i = 0;
        boolean z = false;
        while (i < iM4406) {
            if (C0035.m6107(collection, C0041.m6793(c0271aM3950, i, 1))) {
                C0047.m7836(c0271aM3950, i);
                i--;
                iM4406--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0271a c0271aM3950 = C0018.m3950(this);
        int iM4406 = C0022.m4406(c0271aM3950);
        int i = 0;
        boolean z = false;
        while (i < iM4406) {
            if (!C0035.m6107(collection, C0041.m6793(c0271aM3950, i, 1))) {
                C0047.m7836(c0271aM3950, i);
                i--;
                iM4406--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return C0022.m4406(C0018.m3950(this));
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0271a c0271aM3950 = C0018.m3950(this);
        int iM4406 = C0022.m4406(c0271aM3950);
        Object[] objArr = new Object[iM4406];
        for (int i = 0; i < iM4406; i++) {
            objArr[i] = C0041.m6793(c0271aM3950, i, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return C0013.m3088(C0018.m3950(this), objArr, 1);
    }
}