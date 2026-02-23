package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f467short = {23450, -26086, 901, 904, 897, 916, -27695, 23556, 854, 837, 850, 854, 21683, 20675, 1997, 2001, 2005, 1990, 22650, 18675};

    @SerializedName("label")
    private List<List<String>> a;

    @SerializedName("country")
    private List<String> b;

    @SerializedName("time")
    private List<Integer> c;

    /* renamed from: ۣ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static List m4511(Object obj) {
        if (C0040.m6582() > 0) {
            return ((c) obj).c;
        }
        return null;
    }

    /* renamed from: ۦۣۨۤ, reason: contains not printable characters */
    public static List m4512(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((c) obj).b;
        }
        return null;
    }

    /* renamed from: ۨ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static short[] m4513() {
        if (C0015.m3433() > 0) {
            return f467short;
        }
        return null;
    }

    /* renamed from: ۨۡۡ۟, reason: not valid java name and contains not printable characters */
    public static List m4514(Object obj) {
        if (C0017.m3633() < 0) {
            return ((c) obj).a;
        }
        return null;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strM4199 = C0020.m4199(m4513(), 0, 2, 2802);
        String strM1840 = C0007.m1840();
        C0004.m1532(arrayList2, new com.github.catvod.spider.merge.E.c(strM4199, strM1840));
        List listM4514 = m4514(this);
        if (listM4514 == null) {
            listM4514 = C0008.m1961();
        }
        Iterator itM3109 = C0013.m3109(listM4514);
        while (C0012.m2962(itM3109)) {
            C0004.m1532(arrayList2, new com.github.catvod.spider.merge.E.c((String) C0048.m7915((List) C0048.m7949(itM3109), 0)));
        }
        C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.d(C0047.m7833(m4513(), 2, 4, 1009), C0053.m8477(m4513(), 6, 2, 2959), arrayList2));
        ArrayList arrayList3 = new ArrayList();
        C0004.m1532(arrayList3, new com.github.catvod.spider.merge.E.c(strM4199, strM1840));
        List listM4512 = m4512(this);
        if (listM4512 == null) {
            listM4512 = C0008.m1961();
        }
        Iterator itM31092 = C0013.m3109(listM4512);
        while (C0012.m2962(itM31092)) {
            C0004.m1532(arrayList3, new com.github.catvod.spider.merge.E.c((String) C0048.m7949(itM31092)));
        }
        C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.d(C0053.m8477(m4513(), 8, 4, 823), C0040.m6584(m4513(), 12, 2, 899), arrayList3));
        ArrayList arrayList4 = new ArrayList();
        C0004.m1532(arrayList4, new com.github.catvod.spider.merge.E.c(strM4199, strM1840));
        List listM4511 = m4511(this);
        if (listM4511 == null) {
            listM4511 = C0008.m1961();
        }
        C0027.m5077(listM4511, C0038.m6445());
        List listM45112 = m4511(this);
        if (listM45112 == null) {
            listM45112 = C0008.m1961();
        }
        Iterator itM31093 = C0013.m3109(listM45112);
        while (C0012.m2962(itM31093)) {
            Integer num = (Integer) C0048.m7949(itM31093);
            if (C0024.m4690(num) >= 2010) {
                C0004.m1532(arrayList4, new com.github.catvod.spider.merge.E.c(C0000.m1096(num)));
            }
        }
        C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.d(C0016.m3525(m4513(), 14, 4, 1972), C0049.m8007(m4513(), 18, 2, 1550), arrayList4));
        return arrayList;
    }
}