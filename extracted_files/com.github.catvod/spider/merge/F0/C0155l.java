package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;

/* renamed from: com.github.catvod.spider.merge.F0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155l extends Q {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f435short = {2229, 2227, 2060, 2542, 2530, 548, 2330, 2305, 2328, 2328, 2472};
    public final Q[] c;
    public final int[] d;

    public C0155l(f0 f0Var) {
        this(new Q[]{C0056.m8944(f0Var)}, new int[]{C0021.m4322(f0Var)});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0155l(Q[] qArr, int[] iArr) {
        int iM9238 = 1;
        for (Q q : qArr) {
            iM9238 = C0031.m5632(iM9238, q);
        }
        for (int i : iArr) {
            iM9238 = C0059.m9238(iM9238, i);
        }
        super(C0043.m7334(iM9238, qArr.length * 2));
        this.c = qArr;
        this.d = iArr;
    }

    /* renamed from: ۟۠ۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m3873() {
        if (C0008.m1975() >= 0) {
            return f435short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.Q
    public final Q c(int i) {
        return C0003.m1452(this)[i];
    }

    @Override // com.github.catvod.spider.merge.F0.Q
    public final int d(int i) {
        return C0002.m1328(this)[i];
    }

    @Override // com.github.catvod.spider.merge.F0.Q
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0155l)) {
            return false;
        }
        if (C0000.m1111(this) != C0000.m1111((Q) obj)) {
            return false;
        }
        C0155l c0155l = (C0155l) obj;
        return C0025.m4803(C0002.m1328(this), C0002.m1328(c0155l)) && C0037.m6347(C0003.m1452(this), C0003.m1452(c0155l));
    }

    @Override // com.github.catvod.spider.merge.F0.Q
    public final boolean f() {
        return C0002.m1328(this)[0] == Integer.MAX_VALUE;
    }

    @Override // com.github.catvod.spider.merge.F0.Q
    public final int h() {
        return C0002.m1328(this).length;
    }

    public final String toString() {
        String strM7151;
        if (C0036.m6171(this)) {
            return C0061.m9361(m3873(), 0, 2, 2286);
        }
        StringBuilder sb = new StringBuilder(C0021.m4340(m3873(), 2, 1, 2135));
        int i = 0;
        while (true) {
            int[] iArrM1328 = C0002.m1328(this);
            if (i >= iArrM1328.length) {
                C0018.m3933(sb, C0010.m2300(m3873(), 10, 1, 2549));
                return C0047.m7763(sb);
            }
            if (i > 0) {
                C0018.m3933(sb, C0006.m1774(m3873(), 3, 2, 2498));
            }
            int i2 = iArrM1328[i];
            if (i2 == Integer.MAX_VALUE) {
                strM7151 = C0040.m6584(m3873(), 5, 1, 512);
            } else {
                C0036.m6177(sb, i2);
                Q[] qArrM1452 = C0003.m1452(this);
                if (qArrM1452[i] != null) {
                    C0062.m9399(sb, ' ');
                    strM7151 = C0037.m6312(qArrM1452[i]);
                } else {
                    strM7151 = C0042.m7151(m3873(), 6, 4, 2420);
                }
            }
            C0018.m3933(sb, strM7151);
            i++;
        }
    }
}