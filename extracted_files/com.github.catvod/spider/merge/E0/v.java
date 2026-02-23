package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;

/* loaded from: classes.dex */
public final class v implements u {
    public static final String[] d;
    public static final v e;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f403short = {991, 981, 988};
    public final String[] a;
    public final String[] b;
    public final String[] c;

    static {
        String[] strArr = new String[0];
        d = strArr;
        e = new v(strArr, strArr, strArr);
    }

    public v(String[] strArr, String[] strArr2, String[] strArr3) {
        String[] strArr4 = strArr3;
        String[] strArrM7339 = C0043.m7339();
        this.a = strArr;
        this.b = strArr2;
        strArr4 = strArr4 == null ? strArrM7339 : strArr4;
        this.c = strArr4;
        C0008.m1965(strArr4.length, C0008.m1965(strArr.length, strArr2.length));
    }

    /* renamed from: ۟ۡۥۨ۟, reason: not valid java name and contains not printable characters */
    public static short[] m3788() {
        if (C0020.m4210() <= 0) {
            return f403short;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(int r54) {
        /*
            r53 = this;
            r3 = r54
            r2 = r53
            if (r3 < 0) goto L12
            java.lang.String[] r0 = com.github.catvod.spider.merge.K0.C0022.m4487(r2)
            int r1 = r0.length
            if (r3 >= r1) goto L12
            r0 = r0[r3]
            if (r0 == 0) goto L12
            return r0
        L12:
            if (r3 < 0) goto L1e
            java.lang.String[] r0 = com.github.catvod.spider.p000mergexbpq.a0.C0007.m1807(r2)
            int r1 = r0.length
            if (r3 >= r1) goto L1e
            r0 = r0[r3]
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L22
            return r0
        L22:
            java.lang.String r0 = com.github.catvod.spider.merge.S.C0027.m5032(r2, r3)
            if (r0 == 0) goto L29
            return r0
        L29:
            java.lang.String r3 = com.github.catvod.spider.merge.a0.C0042.m7195(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.E0.v.a(int):java.lang.String");
    }

    public final String b(int i) {
        if (i >= 0) {
            String[] strArrM7191 = C0042.m7191(this);
            if (i < strArrM7191.length) {
                return strArrM7191[i];
            }
        }
        if (i == -1) {
            return C0055.m8814(m3788(), 0, 3, 922);
        }
        return null;
    }
}