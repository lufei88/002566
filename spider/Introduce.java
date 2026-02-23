package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Introduce extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f74short = {2519, 2507, 2507, 2511, 2508, 2437, 2448, 2448, 2526, 2513, 2523, 2509, 2512, 2518, 2523, 2524, 2526, 2507, 2505, 2512, 2523, 2508, 2511, 2518, 2523, 2522, 2509, 2449, 2511, 2526, 2520, 2522, 2508, 2449, 2523, 2522, 2505, 2448, 2504, 2522, 2524, 2519, 2526, 2507, 2449, 2511, 2513, 2520, 22587, 26016, 22564, 18015, 23231, 24646, 25807, 21641, 18791, 25180, -30125, -1946, -29539, 18791, -28949, 18866, -30125, -1946, -29880, -29880, -1941};

    /* renamed from: ۟ۡۨۢ۠, reason: not valid java name and contains not printable characters */
    public static short[] m444() {
        if (C0039.m6529() < 0) {
            return f74short;
        }
        return null;
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        String strM1774 = C0006.m1774(m444(), 0, 48, 2495);
        C0004.m1532(arrayList, new m(strM1774, C0018.m3917(m444(), 48, 5, 2376), strM1774));
        C0004.m1532(arrayList, new m(strM1774, C0020.m4199(m444(), 53, 16, 1898), strM1774));
        return C0047.m7783(arrayList);
    }

    public void init(Context context, String str) {
        super.init(context, str);
    }
}