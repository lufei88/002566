package com.github.catvod.spider.merge.l0;

import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements Iterable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f830short = {1686, 1690, 1690, 1694, 1692, 1680, 2285, 2863};
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();

    public c(Map map) {
        String str = (String) C0062.m9431(map, C0050.m8131(m8843(), 0, 6, 1781));
        if (str != null) {
            for (String str2 : C0024.m4752(str, C0020.m4199(m8843(), 6, 1, 2262))) {
                String[] strArrM4752 = C0024.m4752(C0064.m9640(str2), C0034.m6001(m8843(), 7, 1, 2834));
                if (strArrM4752.length == 2) {
                    C0053.m8424(C0034.m5967(this), strArrM4752[0], strArrM4752[1]);
                }
            }
        }
    }

    /* renamed from: ۣ۟۠ۡۥ, reason: not valid java name and contains not printable characters */
    public static short[] m8843() {
        if (C0000.m1116() <= 0) {
            return f830short;
        }
        return null;
    }

    public final void a() {
        Iterator itM7816 = C0047.m7816(C0012.m3039(this));
        if (C0012.m2962(itM7816)) {
            C0022.m4478(C0048.m7949(itM7816));
            throw null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return C0029.m5199(C0000.m1121(C0034.m5967(this)));
    }
}