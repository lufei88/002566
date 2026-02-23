package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.github.catvod.spider.merge.F0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147d implements Set {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f428short = {2659, 2661, 2272, 2115, 2127};
    public final com.github.catvod.spider.merge.Z0.a a;
    public Object[][] b;
    public int c;
    public int d;
    public final int e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0147d(int i) {
        this(C0000.m1052());
        switch (i) {
            case 1:
                this(C0016.m3531());
                break;
            default:
                break;
        }
    }

    public C0147d(com.github.catvod.spider.merge.Z0.a aVar) {
        this.c = 0;
        this.d = (int) C0041.m6813(12.0d);
        this.a = aVar;
        this.b = new C0145b[16][];
        this.e = 2;
    }

    /* renamed from: ۣ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static short[] m3865() {
        if (C0026.m4977() <= 0) {
            return f428short;
        }
        return null;
    }

    public final boolean a(C0145b c0145b) {
        if (c0145b == null) {
            return false;
        }
        Object[] objArr = C0044.m7422(this)[C0037.m6376(this, c0145b)];
        Object obj = null;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        break;
                    }
                    if (C0003.m1418(C0021.m4367(this), obj2, c0145b)) {
                        obj = obj2;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        return obj != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return C0042.m7137(this, obj) == obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator itM1943 = C0008.m1943(collection);
        boolean z = false;
        while (C0012.m2962(itM1943)) {
            Object objM7949 = C0048.m7949(itM1943);
            if (C0042.m7137(this, objM7949) != objM7949) {
                z = true;
            }
        }
        return z;
    }

    public final int b(Object obj) {
        return C0027.m5078(C0021.m4367(this), obj) & (C0044.m7422(this).length - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(Object obj) {
        Object[] objArrM1439;
        int iM9705 = C0065.m9705(this);
        int iM1591 = C0005.m1591(this);
        int iM5726 = C0032.m5726(this);
        if (iM9705 > iM1591) {
            Object[][] objArrM7422 = C0044.m7422(this);
            int length = objArrM7422.length * 2;
            Object[][] objArr = new C0145b[length][];
            int[] iArr = new int[length];
            this.b = objArr;
            double d = length;
            C0004.m1564(d);
            this.d = (int) (d * 0.75d);
            for (Object[] objArr2 : objArrM7422) {
                if (objArr2 != null) {
                    for (Object obj2 : objArr2) {
                        if (obj2 == null) {
                            break;
                        }
                        int iM6376 = C0037.m6376(this, obj2);
                        int i = iArr[iM6376];
                        if (i == 0) {
                            objArrM1439 = new C0145b[iM5726];
                            objArr[iM6376] = objArrM1439;
                        } else {
                            objArrM1439 = objArr[iM6376];
                            if (i == objArrM1439.length) {
                                objArrM1439 = C0003.m1439(objArrM1439, objArrM1439.length * 2);
                                objArr[iM6376] = objArrM1439;
                            }
                        }
                        objArrM1439[i] = obj2;
                        iArr[iM6376] = iArr[iM6376] + 1;
                    }
                }
            }
        }
        int iM63762 = C0037.m6376(this, obj);
        Object[][] objArrM74222 = C0044.m7422(this);
        Object[] objArr3 = objArrM74222[iM63762];
        if (objArr3 != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= objArr3.length) {
                    int length2 = objArr3.length;
                    Object[] objArrM14392 = C0003.m1439(objArr3, objArr3.length * 2);
                    C0044.m7422(this)[iM63762] = objArrM14392;
                    objArrM14392[length2] = obj;
                    break;
                }
                Object obj3 = objArr3[i2];
                if (obj3 == null) {
                    objArr3[i2] = obj;
                    break;
                }
                if (C0003.m1418(C0021.m4367(this), obj3, obj)) {
                    return obj3;
                }
                i2++;
            }
        } else {
            Object[] objArr4 = new C0145b[iM5726];
            objArr4[0] = obj;
            objArrM74222[iM63762] = objArr4;
        }
        this.c = C0065.m9705(this) + 1;
        return obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.b = new C0145b[16][];
        this.c = 0;
        this.d = (int) C0041.m6813(12.0d);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return C0024.m4727(this, !(obj instanceof C0145b) ? null : (C0145b) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0034, code lost:
    
        continue;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsAll(java.util.Collection r61) {
        /*
            r60 = this;
            r10 = r61
            r9 = r60
            boolean r0 = r10 instanceof com.github.catvod.spider.merge.F0.C0147d
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L37
            com.github.catvod.spider.merge.F0.d r10 = (com.github.catvod.spider.merge.F0.C0147d) r10
            java.lang.Object[][] r10 = com.github.catvod.spider.merge.b.C0044.m7422(r10)
            int r0 = r10.length
            r3 = 0
        L12:
            if (r3 >= r0) goto L54
            r4 = r10[r3]
            if (r4 != 0) goto L19
            goto L34
        L19:
            int r5 = r4.length
            r6 = 0
        L1b:
            if (r6 >= r5) goto L34
            r7 = r4[r6]
            if (r7 != 0) goto L22
            goto L34
        L22:
            boolean r8 = r7 instanceof com.github.catvod.spider.merge.F0.C0145b
            if (r8 != 0) goto L28
            r7 = r1
            goto L2a
        L28:
            com.github.catvod.spider.merge.F0.b r7 = (com.github.catvod.spider.merge.F0.C0145b) r7
        L2a:
            boolean r7 = com.github.catvod.spider.merge.P0.C0024.m4727(r9, r7)
            if (r7 != 0) goto L31
            return r2
        L31:
            int r6 = r6 + 1
            goto L1b
        L34:
            int r3 = r3 + 1
            goto L12
        L37:
            java.util.Iterator r10 = com.github.catvod.spider.p000mergexbpq.b0.C0008.m1943(r10)
        L3b:
            boolean r0 = com.github.catvod.spider.p000mergexbpq.i.C0012.m2962(r10)
            if (r0 == 0) goto L54
            java.lang.Object r0 = com.github.catvod.spider.merge.d0.C0048.m7949(r10)
            boolean r3 = r0 instanceof com.github.catvod.spider.merge.F0.C0145b
            if (r3 != 0) goto L4b
            r0 = r1
            goto L4d
        L4b:
            com.github.catvod.spider.merge.F0.b r0 = (com.github.catvod.spider.merge.F0.C0145b) r0
        L4d:
            boolean r0 = com.github.catvod.spider.merge.P0.C0024.m4727(r9, r0)
            if (r0 != 0) goto L3b
            return r2
        L54:
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.F0.C0147d.containsAll(java.util.Collection):boolean");
    }

    public final boolean d(C0145b c0145b) {
        Object obj;
        if (c0145b == null) {
            return false;
        }
        Object[] objArr = C0044.m7422(this)[C0037.m6376(this, c0145b)];
        if (objArr == null) {
            return false;
        }
        for (int i = 0; i < objArr.length && (obj = objArr[i]) != null; i++) {
            if (C0003.m1418(C0021.m4367(this), obj, c0145b)) {
                C0062.m9384(objArr, i + 1, objArr, i, (objArr.length - i) - 1);
                objArr[objArr.length - 1] = null;
                this.c = C0065.m9705(this) - 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0147d)) {
            return false;
        }
        C0147d c0147d = (C0147d) obj;
        if (C0065.m9705(c0147d) != C0065.m9705(this)) {
            return false;
        }
        return C0026.m4975(this, c0147d);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int iM9238 = 0;
        for (Object[] objArr : C0044.m7422(this)) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        break;
                    }
                    iM9238 = C0059.m9238(iM9238, C0027.m5078(C0021.m4367(this), obj));
                }
            }
        }
        return C0043.m7334(iM9238, C0065.m9705(this));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return C0065.m9705(this) == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new com.github.catvod.spider.merge.H0.a(this, C0046.m7690(this));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return C0003.m1467(this, !(obj instanceof C0145b) ? null : (C0145b) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator itM1943 = C0008.m1943(collection);
        boolean zM1467 = false;
        while (C0012.m2962(itM1943)) {
            Object objM7949 = C0048.m7949(itM1943);
            zM1467 |= C0003.m1467(this, !(objM7949 instanceof C0145b) ? null : (C0145b) objM7949);
        }
        return zM1467;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Object obj;
        int i = 0;
        for (Object[] objArr : C0044.m7422(this)) {
            if (objArr != null) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < objArr.length && (obj = objArr[i2]) != null) {
                    if (C0035.m6107(collection, obj)) {
                        if (i2 != i3) {
                            objArr[i3] = objArr[i2];
                        }
                        i3++;
                        i++;
                    }
                    i2++;
                }
                i += i3;
                while (i3 < i2) {
                    objArr[i3] = null;
                    i3++;
                }
            }
        }
        boolean z = i != C0065.m9705(this);
        this.c = i;
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return C0065.m9705(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0145b[] c0145bArr = new C0145b[C0065.m9705(this)];
        int i = 0;
        for (Object[] objArr : C0044.m7422(this)) {
            if (objArr != null) {
                int length = objArr.length;
                int i2 = 0;
                while (i2 < length) {
                    Object obj = objArr[i2];
                    if (obj == null) {
                        break;
                    }
                    c0145bArr[i] = obj;
                    i2++;
                    i++;
                }
            }
        }
        return c0145bArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArrM1439 = objArr;
        int length = objArrM1439.length;
        int iM9705 = C0065.m9705(this);
        if (length < iM9705) {
            objArrM1439 = C0003.m1439(objArrM1439, iM9705);
        }
        int i = 0;
        for (Object[] objArr2 : C0044.m7422(this)) {
            if (objArr2 != null) {
                int length2 = objArr2.length;
                int i2 = 0;
                while (i2 < length2) {
                    Object obj = objArr2[i2];
                    if (obj == null) {
                        break;
                    }
                    objArrM1439[i] = obj;
                    i2++;
                    i++;
                }
            }
        }
        return objArrM1439;
    }

    public final String toString() {
        if (C0065.m9705(this) == 0) {
            return C0058.m9106(m3865(), 0, 2, 2584);
        }
        StringBuilder sb = new StringBuilder(C0056.m8911(m3865(), 2, 1, 2203));
        boolean z = true;
        for (Object[] objArr : C0044.m7422(this)) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        break;
                    }
                    if (z) {
                        z = false;
                    } else {
                        C0018.m3933(sb, C0007.m1842(m3865(), 3, 2, 2159));
                    }
                    C0018.m3933(sb, C0037.m6312(obj));
                }
            }
        }
        C0062.m9399(sb, '}');
        return C0047.m7763(sb);
    }
}