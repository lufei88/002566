package com.github.catvod.spider.merge.E;

import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class h {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f388short = {1894, 1892, 1892, 3302, 3302, 3316, 2395, 2377, 2377, 538, 523, 523, 535, 530, 536, 538, 527, 530, 532, 533, 596, 515, 598, 520, 526, 537, 521, 530, 523, 1506, 1523, 1518, 1506, 1465, 1504, 1506, 1506, 2546, 2531, 2558, 2546, 2473, 2558, 2475, 2549, 2549, 2535};

    @SerializedName("url")
    private String a;

    @SerializedName("name")
    private String b;

    @SerializedName("lang")
    private String c;

    @SerializedName("format")
    private String d;

    /* renamed from: ۦۨۧ۟, reason: contains not printable characters */
    public static short[] m3770() {
        if (C0004.m1557() < 0) {
            return f388short;
        }
        return null;
    }

    public final void a(String str) {
        C0047.m7777(str);
        char c = 65535;
        switch (C0054.m8590(str)) {
            case 96897:
                if (C0007.m1815(str, C0025.m4795(m3770(), 6, 3, 2362))) {
                    c = 0;
                    break;
                }
                break;
            case 114177:
                if (C0007.m1815(str, C0008.m1970(m3770(), 3, 3, 3221))) {
                    c = 1;
                    break;
                }
                break;
            case 117110:
                if (C0007.m1815(str, C0037.m6307(m3770(), 0, 3, 1808))) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                this.d = C0046.m7718(m3770(), 37, 10, 2438);
                break;
            case 2:
                this.d = C0029.m5256(m3770(), 29, 8, 1430);
                break;
            default:
                this.d = C0031.m5565(m3770(), 9, 20, 635);
                break;
        }
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(String str) {
        this.b = str;
    }

    public final void d(String str) {
        this.a = str;
    }
}