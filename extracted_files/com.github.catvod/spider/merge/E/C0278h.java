package com.github.catvod.spider.merge.e;

import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.github.catvod.spider.merge.e.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278h implements Set {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0271a b;

    public /* synthetic */ C0278h(C0271a c0271a, int i) {
        this.a = i;
        this.b = c0271a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (C0062.m9442(this)) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (C0062.m9442(this)) {
            case 0:
                C0271a c0271aM2980 = C0012.m2980(this);
                int iM4406 = C0022.m4406(c0271aM2980);
                Iterator itM1943 = C0008.m1943(collection);
                while (C0012.m2962(itM1943)) {
                    Map.Entry entry = (Map.Entry) C0048.m7949(itM1943);
                    C0025.m4773(c0271aM2980, C0045.m7624(entry), C0039.m6540(entry));
                }
                return iM4406 != C0022.m4406(c0271aM2980);
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (C0062.m9442(this)) {
            case 0:
                C0060.m9314(C0012.m2980(this));
                break;
            default:
                C0060.m9314(C0012.m2980(this));
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (C0062.m9442(this)) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object objM7624 = C0045.m7624(entry);
                    C0271a c0271aM2980 = C0012.m2980(this);
                    int iM7268 = C0043.m7268(c0271aM2980, objM7624);
                    if (iM7268 >= 0) {
                        Object objM6793 = C0041.m6793(c0271aM2980, iM7268, 1);
                        Object objM6540 = C0039.m6540(entry);
                        if (objM6793 == objM6540 || (objM6793 != null && C0058.m9103(objM6793, objM6540))) {
                        }
                    }
                }
                break;
            default:
                if (C0043.m7268(C0012.m2980(this), obj) >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (C0062.m9442(this)) {
            case 0:
                Iterator itM1943 = C0008.m1943(collection);
                while (C0012.m2962(itM1943)) {
                    if (!C0003.m1441(this, C0048.m7949(itM1943))) {
                        break;
                    }
                }
                break;
            default:
                Map mapM5171 = C0028.m5171(C0012.m2980(this));
                Iterator itM19432 = C0008.m1943(collection);
                while (C0012.m2962(itM19432)) {
                    if (!C0024.m4748(mapM5171, C0048.m7949(itM19432))) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (C0062.m9442(this)) {
        }
        return C0056.m8897(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (C0062.m9442(this)) {
            case 0:
                C0271a c0271aM2980 = C0012.m2980(this);
                int iM8087 = 0;
                for (int iM4406 = C0022.m4406(c0271aM2980) - 1; iM4406 >= 0; iM4406--) {
                    Object objM6793 = C0041.m6793(c0271aM2980, iM4406, 0);
                    Object objM67932 = C0041.m6793(c0271aM2980, iM4406, 1);
                    iM8087 += (objM6793 == null ? 0 : C0050.m8087(objM6793)) ^ (objM67932 == null ? 0 : C0050.m8087(objM67932));
                }
                return iM8087;
            default:
                C0271a c0271aM29802 = C0012.m2980(this);
                int iM80872 = 0;
                for (int iM44062 = C0022.m4406(c0271aM29802) - 1; iM44062 >= 0; iM44062--) {
                    Object objM67933 = C0041.m6793(c0271aM29802, iM44062, 0);
                    iM80872 += objM67933 == null ? 0 : C0050.m8087(objM67933);
                }
                return iM80872;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (C0062.m9442(this)) {
            case 0:
                if (C0022.m4406(C0012.m2980(this)) == 0) {
                }
                break;
            default:
                if (C0022.m4406(C0012.m2980(this)) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (C0062.m9442(this)) {
            case 0:
                return new C0279i(C0012.m2980(this));
            default:
                return new C0277g(C0012.m2980(this), 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (C0062.m9442(this)) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0271a c0271aM2980 = C0012.m2980(this);
                int iM7268 = C0043.m7268(c0271aM2980, obj);
                if (iM7268 < 0) {
                    return false;
                }
                C0047.m7836(c0271aM2980, iM7268);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (C0062.m9442(this)) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapM5171 = C0028.m5171(C0012.m2980(this));
                int iM6428 = C0038.m6428(mapM5171);
                Iterator itM1943 = C0008.m1943(collection);
                while (C0012.m2962(itM1943)) {
                    C0043.m7292(mapM5171, C0048.m7949(itM1943));
                }
                return iM6428 != C0038.m6428(mapM5171);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (C0062.m9442(this)) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapM5171 = C0028.m5171(C0012.m2980(this));
                int iM6428 = C0038.m6428(mapM5171);
                Iterator itM5199 = C0029.m5199(C0026.m4887(mapM5171));
                while (C0012.m2962(itM5199)) {
                    if (!C0035.m6107(collection, C0048.m7949(itM5199))) {
                        C0005.m1641(itM5199);
                    }
                }
                return iM6428 != C0038.m6428(mapM5171);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (C0062.m9442(this)) {
        }
        return C0022.m4406(C0012.m2980(this));
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (C0062.m9442(this)) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0271a c0271aM2980 = C0012.m2980(this);
                int iM4406 = C0022.m4406(c0271aM2980);
                Object[] objArr = new Object[iM4406];
                for (int i = 0; i < iM4406; i++) {
                    objArr[i] = C0041.m6793(c0271aM2980, i, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (C0062.m9442(this)) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return C0013.m3088(C0012.m2980(this), objArr, 0);
        }
    }
}