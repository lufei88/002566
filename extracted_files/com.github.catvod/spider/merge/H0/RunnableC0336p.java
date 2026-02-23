package com.github.catvod.spider.merge.h0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.RunnableC0241b;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.h0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0336p implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f819short = {3270, 3290, 3290, 3294, 3220, 3201, 3201, 3231, 3228, 3225, 3200, 3230, 3200, 3230, 3200, 3231, 3220, 3223, 3223, 3223, 3225, 3201, 3294, 3292, 3265, 3286, 3287, 3217, 3274, 3265, 3219, 3293, 3275, 3279, 3277, 3270, 3274, 3279, 3264, 3267, 3291, 3208, 3273, 3265, 3219, 3274, 3279, 3264, 3267, 3291, 3279, 3294, 3271, 3208, 3289, 3274, 3219, 855, 850, 840, 847, 1247, 1234, 1243, 1230, 1268, 1221, 1226, 1222, 1230};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0340u b;
    public final /* synthetic */ String c;

    public /* synthetic */ RunnableC0336p(C0340u c0340u, String str, int i) {
        this.a = i;
        this.b = c0340u;
        this.c = str;
    }

    /* renamed from: ۦۥۧۥ, reason: contains not printable characters */
    public static short[] m8671() {
        if (C0032.m5686() <= 0) {
            return f819short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0025.m4844(this)) {
            case 0:
                C0340u c0340uM6794 = C0041.m6794(this);
                C0010.m2366(c0340uM6794);
                String strM1181 = C0001.m1181(this);
                if (strM1181 != null && !C0057.m8953(C0064.m9640(strM1181))) {
                    C0042.m7106(C0049.m8034(c0340uM6794), C0064.m9640(strM1181));
                    C0022.m4419(c0340uM6794);
                    break;
                }
                break;
            default:
                String strM11812 = C0001.m1181(this);
                C0340u c0340uM67942 = C0041.m6794(this);
                C0047.m7777(c0340uM67942);
                try {
                    StringBuilder sb = new StringBuilder(C0044.m7509(m8671(), 0, 57, 3246));
                    C0018.m3933(sb, strM11812);
                    JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0032.m5769(C0047.m7763(sb), null)), C0047.m7833(m8671(), 57, 4, 827));
                    HashMap mapM9692 = C0064.m9692(c0340uM67942);
                    C0062.m9402(mapM9692);
                    for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
                        JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
                        String strM1212 = C0001.m1212(jSONObjectM3923, C0030.m5362(m8671(), 61, 9, 1195));
                        if (!C0058.m9098(mapM9692, strM1212)) {
                            C0053.m8424(mapM9692, strM1212, new ArrayList());
                        }
                        C0063.m9550((List) C0065.m9715(mapM9692, strM1212), jSONObjectM3923);
                    }
                    C0016.m3575(new RunnableC0337q(c0340uM67942, 2));
                    break;
                } catch (Exception e) {
                    C0016.m3575(new RunnableC0241b(c0340uM67942, e, 9));
                    C0049.m7975(e);
                }
        }
    }
}