package com.github.catvod.spider.merge.H0;

import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.c.C0009;

/* loaded from: classes.dex */
public final class d {
    public static final int[] c = new int[0];
    public int[] a = C0055.m8772();
    public int b;

    public final void a(int i) {
        int[] iArrM2085 = C0009.m2085(this);
        int length = iArrM2085.length;
        int iM9566 = C0063.m9566(this);
        if (length == iM9566) {
            int i2 = iM9566 + 1;
            if (i2 < 0 || i2 > 2147483639) {
                throw new OutOfMemoryError();
            }
            int length2 = iArrM2085.length == 0 ? 4 : iArrM2085.length;
            while (length2 < i2) {
                length2 *= 2;
                if (length2 < 0 || length2 > 2147483639) {
                    length2 = 2147483639;
                }
            }
            this.a = C0027.m4994(C0009.m2085(this), length2);
        }
        int[] iArrM20852 = C0009.m2085(this);
        int iM95662 = C0063.m9566(this);
        iArrM20852[iM95662] = i;
        this.b = iM95662 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (C0063.m9566(this) != C0063.m9566(dVar)) {
            return false;
        }
        for (int i = 0; i < C0063.m9566(this); i++) {
            if (C0009.m2085(this)[i] != C0009.m2085(dVar)[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < C0063.m9566(this); i2++) {
            i = (i * 31) + C0009.m2085(this)[i2];
        }
        return i;
    }

    public final String toString() {
        int iM9566 = C0063.m9566(this);
        return C0031.m5588(iM9566 == 0 ? C0055.m8772() : C0027.m4994(C0009.m2085(this), iM9566));
    }
}