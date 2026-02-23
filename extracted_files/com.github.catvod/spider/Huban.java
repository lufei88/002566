package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Huban extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f71short = {1793, 21748, -29003, 28010, 32383, 23320, 29781};

    /* renamed from: ۟ۡۢۢۨ, reason: not valid java name and contains not printable characters */
    public static short[] m434() {
        if (C0012.m3024() >= 0) {
            return f71short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        C0001.m1155(C0060.m9300());
        return C0007.m1840();
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0004.m1532(arrayList2, new b(new String[]{C0005.m1645(m434(), 0, 1, 1840)}[0], new String[]{C0048.m7902(m434(), 1, 6, 2299)}[0], null));
        return C0025.m4831(arrayList2, arrayList);
    }

    public void init(Context context) {
    }
}