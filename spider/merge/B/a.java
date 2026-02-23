package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f372short = {457, 494, 486, 483, 490, 491, 431, 507, 480, 431, 492, 494, 483, 483, 431, 480, 493, 508, 490, 509, 505, 490, 509, 431, 482, 490, 507, 487, 480, 491};
    public final HashMap a = new HashMap();
    public final Map b;

    public a(HashMap map) {
        this.b = map;
        Iterator itM5199 = C0029.m5199(C0043.m7267(map));
        while (C0012.m2962(itM5199)) {
            Map.Entry entry = (Map.Entry) C0048.m7949(itM5199);
            g gVar = (g) C0039.m6540(entry);
            Object arrayList = (List) C0065.m9715(C0052.m8325(this), gVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                C0053.m8424(C0052.m8325(this), gVar, arrayList);
            }
            C0063.m9550(arrayList, C0045.m7624(entry));
        }
    }

    public static void a(List list, k kVar, g gVar, Object obj) {
        if (list != null) {
            for (int iM9636 = C0064.m9636(list) - 1; iM9636 >= 0; iM9636--) {
                b bVar = (b) C0048.m7915(list, iM9636);
                C0047.m7777(bVar);
                try {
                    int iM1527 = C0004.m1527(bVar);
                    Method methodM3475 = C0015.m3475(bVar);
                    if (iM1527 == 0) {
                        C0052.m8352(methodM3475, obj, null);
                    } else if (iM1527 == 1) {
                        C0052.m8352(methodM3475, obj, new Object[]{kVar});
                    } else if (iM1527 == 2) {
                        C0052.m8352(methodM3475, obj, new Object[]{kVar, gVar});
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(C0032.m5708(m3617(), 0, 30, 399), C0021.m4357(e2));
                }
            }
        }
    }

    /* renamed from: ۦ۠ۧ۠, reason: contains not printable characters */
    public static short[] m3617() {
        if (C0013.m3167() > 0) {
            return f372short;
        }
        return null;
    }
}