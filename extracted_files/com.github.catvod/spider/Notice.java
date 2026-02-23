package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.b0.o;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0300c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Notice extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f93short = {2732, 2732, 2732, 2732, 2712, 2712, 2737, 2737, 2717, 2717, 2744, 2744, 2726, 2726, 631, 619, 619, 623, 1946, 1924, 1936, 940, 957, 954, 937, 956, 929, 935, 934, 2172, 2169, 2156, 2173};
    public C0300c a;
    public String b;
    public int c;
    public String d;
    public final Runnable e = new Runnable() { // from class: com.github.catvod.spider.Notice.1
        /* renamed from: ۡۥۡۨ, reason: not valid java name and contains not printable characters */
        public static Notice m519(Object obj) {
            if (C0045.m7538() < 0) {
                return Notice.this;
            }
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Random random = new Random();
            Notice noticeM519 = m519(this);
            C0026.m4878(C0013.m3090(noticeM519), C0042.m7113(255, C0025.m4817(random, 128), C0025.m4817(random, 128), C0025.m4817(random, 128)));
            C0017.m3665(C0021.m4344(noticeM519), 500);
        }
    };

    public static void show(String str) {
        try {
            Notice notice = new Notice();
            C0000.m1115(notice, null, str);
            C0022.m4400(notice, false);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ۨۥۣۣ, reason: not valid java name and contains not printable characters */
    public static short[] m518() {
        if (C0054.m8557() < 0) {
            return f93short;
        }
        return null;
    }

    public String homeContent(boolean z) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0042.m7151(m518(), 0, 14, 2773), C0045.m7549());
        JSONObject jSONObject = new JSONObject(C0043.m7277(C0021.m4331(this), C0023.m4536(m518(), 14, 4, 543)) ? C0032.m5769(C0021.m4331(this), null) : new String(C0034.m5997(C0021.m4331(this), 0)));
        this.d = C0051.m8200(jSONObject, C0026.m4951(m518(), 18, 3, 2039));
        this.c = C0027.m5075(jSONObject, C0065.m9775(m518(), 21, 8, 968), 30);
        String strM8200 = C0051.m8200(jSONObject, C0064.m9599(m518(), 29, 4, 2072));
        if (C0004.m1584(C0022.m4423(this)) > 0 && (C0057.m8953(strM8200) || C0014.m3374(new Date(), C0007.m1875(simpleDateFormat, strM8200)))) {
            C0017.m3665(new o(this, 0), 500);
        }
        return C0007.m1840();
    }

    public void init(Context context, String str) {
        this.b = str;
    }
}