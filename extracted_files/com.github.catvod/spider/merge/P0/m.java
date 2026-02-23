package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class m extends i {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f485short = {446, 446, 425, 511, 483, 447, 461, 445, 443, 459, 458, 498, 493, 418, 491, 490, 465, 475, 450, 461, 445, 443, 459, 458, 498, 493, 423, 442, 420, 491, 428, 458, 498, 493, 420, 491, 1892, 1902, 1911, 373, 2600, 2581, 2577, 2585, 2598, 2579, 2578, 2585, 2607, 2568, 2574, 2589, 2568, 2585, 2587, 2565, 2652, 2599, 2576, 2579, 2591, 2589, 2576, 2585, 2625, 576, 588, 536, 534, 546, 525, 513, 521, 543, 593, 3049, 3045, 2997, 2980, 2993, 2993, 2976, 2999, 2987, 3064, 463};
    public final Locale b;
    public final HashMap c = new HashMap();

    public m(Locale locale) {
        this.b = C0060.m9324(locale);
        StringBuilder sbM5621 = C0031.m5621(C0026.m4951(m4641(), 0, 36, 406));
        TreeSet treeSet = new TreeSet(C0064.m9678());
        for (String[] strArr : C0050.m8086(C0010.m2388(locale))) {
            String str = strArr[0];
            if (!C0000.m1057(str, C0037.m6307(m4641(), 36, 3, 1827))) {
                TimeZone timeZoneM1658 = C0005.m1658(str);
                l lVar = new l(timeZoneM1658, false);
                l lVar2 = lVar;
                for (int i = 1; i < strArr.length; i++) {
                    if (i == 3) {
                        lVar2 = new l(timeZoneM1658, true);
                    } else if (i == 5) {
                        lVar2 = lVar;
                    }
                    String str2 = strArr[i];
                    if (str2 != null) {
                        String strM6565 = C0039.m6565(str2, locale);
                        if (C0037.m6367(treeSet, strM6565)) {
                            C0053.m8424(C0009.m2091(this), strM6565, lVar2);
                        }
                    }
                }
            }
        }
        Iterator itM1365 = C0003.m1365(treeSet);
        while (C0012.m2962(itM1365)) {
            String str3 = (String) C0048.m7949(itM1365);
            C0062.m9399(sbM5621, '|');
            C0000.m1075(sbM5621, str3);
        }
        C0018.m3933(sbM5621, C0041.m6779(m4641(), 39, 1, 348));
        this.a = C0005.m1602(C0047.m7763(sbM5621));
    }

    /* renamed from: ۣۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static short[] m4641() {
        if (C0026.m4977() <= 0) {
            return f485short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.P0.i
    public final void c(Calendar calendar, String str) {
        E eM7314 = C0043.m7314(str);
        if (eM7314 != null) {
            C0050.m8141(calendar, eM7314);
            return;
        }
        String strM6565 = C0039.m6565(str, C0029.m5239(this));
        HashMap mapM2091 = C0009.m2091(this);
        l lVar = (l) C0065.m9715(mapM2091, strM6565);
        if (lVar == null) {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, strM6565);
            C0062.m9399(sb, '.');
            lVar = (l) C0065.m9715(mapM2091, C0047.m7763(sb));
        }
        C0065.m9714(calendar, 16, C0051.m8258(lVar));
        C0065.m9714(calendar, 15, C0057.m8992(C0017.m3695(lVar)));
    }

    @Override // com.github.catvod.spider.merge.P0.i
    public final String toString() {
        StringBuilder sb = new StringBuilder(C0063.m9585(m4641(), 40, 25, 2684));
        C0016.m3605(sb, C0029.m5239(this));
        C0018.m3933(sb, C0050.m8131(m4641(), 65, 10, 620));
        C0016.m3605(sb, C0009.m2091(this));
        C0018.m3933(sb, C0022.m4403(m4641(), 75, 10, 3013));
        C0016.m3605(sb, C0053.m8402(this));
        C0018.m3933(sb, C0048.m7902(m4641(), 85, 1, 402));
        return C0047.m7763(sb);
    }
}