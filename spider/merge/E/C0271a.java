package com.github.catvod.spider.merge.e;

import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import java.util.Map;
import java.util.Set;

/* renamed from: com.github.catvod.spider.merge.e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f772short = {2021, 2020, 2047, 1963, 2026, 1963, 2022, 2026, 2043, 1289, 1288, 1299, 1351, 1286, 1351, 1290, 1286, 1303};
    public C0278h a;
    public C0278h b;
    public C0280j c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public C0271a(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    public static boolean j(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (C0007.m1832(set) == C0007.m1832(set2)) {
                    if (C0065.m9725(set, set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: ۣۦ۟, reason: not valid java name and contains not printable characters */
    public static short[] m8162() {
        if (C0057.m9017() >= 0) {
            return f772short;
        }
        return null;
    }

    public final void a() {
        switch (C0007.m1864(this)) {
            case 0:
                C0065.m9793((C0272b) C0003.m1440(this));
                break;
            default:
                C0057.m8972((C0273c) C0003.m1440(this));
                break;
        }
    }

    public final Object b(int i, int i2) {
        switch (C0007.m1864(this)) {
            case 0:
                return C0009.m2126((C0272b) C0003.m1440(this))[(i << 1) + i2];
            default:
                return C0035.m6158((C0273c) C0003.m1440(this))[i];
        }
    }

    public final Map c() {
        switch (C0007.m1864(this)) {
            case 0:
                return (C0272b) C0003.m1440(this);
            default:
                throw new UnsupportedOperationException(C0020.m4199(m8162(), 0, 9, 1931));
        }
    }

    public final int d() {
        switch (C0007.m1864(this)) {
            case 0:
                return C0042.m7150((C0272b) C0003.m1440(this));
            default:
                return C0044.m7475((C0273c) C0003.m1440(this));
        }
    }

    public final int e(Object obj) {
        switch (C0007.m1864(this)) {
            case 0:
                return C0046.m7730((C0272b) C0003.m1440(this), obj);
            default:
                return C0026.m4898((C0273c) C0003.m1440(this), obj);
        }
    }

    public final int f(Object obj) {
        switch (C0007.m1864(this)) {
            case 0:
                return C0045.m7540((C0272b) C0003.m1440(this), obj);
            default:
                return C0026.m4898((C0273c) C0003.m1440(this), obj);
        }
    }

    public final void g(Object obj, Object obj2) {
        switch (C0007.m1864(this)) {
            case 0:
                C0005.m1666((C0272b) C0003.m1440(this), obj, obj2);
                break;
            default:
                C0000.m1097((C0273c) C0003.m1440(this), obj);
                break;
        }
    }

    public final void h(int i) {
        switch (C0007.m1864(this)) {
            case 0:
                C0052.m8300((C0272b) C0003.m1440(this), i);
                break;
            default:
                C0052.m8298((C0273c) C0003.m1440(this), i);
                break;
        }
    }

    public final Object i(int i, Object obj) {
        switch (C0007.m1864(this)) {
            case 0:
                int i2 = (i << 1) + 1;
                Object[] objArrM2126 = C0009.m2126((C0272b) C0003.m1440(this));
                Object obj2 = objArrM2126[i2];
                objArrM2126[i2] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException(C0051.m8259(m8162(), 9, 9, 1383));
        }
    }

    public final Object[] k(Object[] objArr, int i) {
        Object[] objArr2 = objArr;
        int iM4406 = C0022.m4406(this);
        if (objArr2.length < iM4406) {
            objArr2 = (Object[]) C0047.m7792(C0030.m5404(C0047.m7777(objArr2)), iM4406);
        }
        for (int i2 = 0; i2 < iM4406; i2++) {
            objArr2[i2] = C0041.m6793(this, i2, i);
        }
        if (objArr2.length > iM4406) {
            objArr2[iM4406] = null;
        }
        return objArr2;
    }
}