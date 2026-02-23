package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124g extends ArrayList<l> {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f325short = {2519, 823};

    public C0124g() {
    }

    public C0124g(int i) {
        super(i);
    }

    public C0124g(List<l> list) {
        super(list);
    }

    public C0124g(l... lVarArr) {
        super(C0001.m1203(lVarArr));
    }

    /* renamed from: ۣۧۢ۟, reason: not valid java name and contains not printable characters */
    public static short[] m2700() {
        if (C0027.m5017() >= 0) {
            return f325short;
        }
        return null;
    }

    public final String a(String str) {
        Iterator itM7807 = C0047.m7807(this);
        while (C0012.m2962(itM7807)) {
            l lVar = (l) C0048.m7949(itM7807);
            if (C0040.m6638(lVar, str)) {
                return C0058.m9094(lVar, str);
            }
        }
        return C0007.m1840();
    }

    public final C0124g b(int i) {
        return C0009.m2095(this) > i ? new C0124g((l) C0028.m5161(this, i)) : new C0124g();
    }

    public final l c() {
        if (C0019.m4116(this)) {
            return null;
        }
        return (l) C0028.m5161(this, C0009.m2095(this) - 1);
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        C0124g c0124g = new C0124g(C0009.m2095(this));
        Iterator itM7807 = C0047.m7807(this);
        while (C0012.m2962(itM7807)) {
            C0018.m3918(c0124g, C0033.m5790((l) C0048.m7949(itM7807)));
        }
        return c0124g;
    }

    public final C0124g d(String str) {
        C0006.m1786(str);
        N nM3700 = C0017.m3700(str);
        C0124g c0124g = new C0124g();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator itM7816 = C0047.m7816(this);
        while (C0012.m2962(itM7816)) {
            l lVar = (l) C0048.m7949(itM7816);
            C0023.m4613(nM3700);
            C0023.m4613(lVar);
            Iterator itM7807 = C0047.m7807(C0032.m5756(nM3700, lVar));
            while (C0012.m2962(itM7807)) {
                l lVar2 = (l) C0048.m7949(itM7807);
                if (C0013.m3172(identityHashMap, lVar2, C0000.m1129()) == null) {
                    C0018.m3918(c0124g, lVar2);
                }
            }
        }
        return c0124g;
    }

    public final String e() {
        StringBuilder sbM9299 = C0060.m9299();
        Iterator itM7807 = C0047.m7807(this);
        while (C0012.m2962(itM7807)) {
            l lVar = (l) C0048.m7949(itM7807);
            if (C0006.m1693(sbM9299) != 0) {
                C0018.m3933(sbM9299, C0063.m9585(m2700(), 0, 1, 2551));
            }
            C0018.m3933(sbM9299, C0053.m8412(lVar));
        }
        return C0026.m4919(sbM9299);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbM9299 = C0060.m9299();
        Iterator itM7807 = C0047.m7807(this);
        while (C0012.m2962(itM7807)) {
            l lVar = (l) C0048.m7949(itM7807);
            if (C0006.m1693(sbM9299) != 0) {
                C0018.m3933(sbM9299, C0008.m1970(m2700(), 1, 1, 829));
            }
            C0018.m3933(sbM9299, C0025.m4814(lVar));
        }
        return C0026.m4919(sbM9299);
    }
}