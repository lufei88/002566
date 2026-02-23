package com.github.catvod.spider.merge.I0;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.SizeF;
import android.view.WindowInsets;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;
import com.github.catvod.spider.Baidu;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.DaGongRen;
import com.github.catvod.spider.HBDmSou;
import com.github.catvod.spider.HBT4;
import com.github.catvod.spider.HBgetapp;
import com.github.catvod.spider.HBrren;
import com.github.catvod.spider.Jianpian;
import com.github.catvod.spider.NG;
import com.github.catvod.spider.Notice;
import com.github.catvod.spider.PanSou;
import com.github.catvod.spider.Xb6v;
import com.github.catvod.spider.merge-xbpq.Q.k0;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.D.f;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0145b;
import com.github.catvod.spider.merge.F0.C0164v;
import com.github.catvod.spider.merge.F0.C0166x;
import com.github.catvod.spider.merge.F0.C0168z;
import com.github.catvod.spider.merge.F0.K;
import com.github.catvod.spider.merge.F0.M;
import com.github.catvod.spider.merge.F0.N;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.G0.d;
import com.github.catvod.spider.merge.I.i;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.U.p;
import com.github.catvod.spider.merge.U0.I;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.DialogInterfaceOnClickListenerC0226b;
import com.github.catvod.spider.merge.W.n;
import com.github.catvod.spider.merge.W.t;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.L;
import com.github.catvod.spider.merge.a0.RunnableC0239H;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.b0.h;
import com.github.catvod.spider.merge.b0.o;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.e;
import com.github.catvod.spider.merge.h0.C0320I;
import com.github.catvod.spider.merge.h0.RunnableC0317F;
import com.github.catvod.spider.merge.h0.RunnableC0325e;
import com.github.catvod.spider.merge.i.C0342b;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t0.AbstractC0368a;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.D;
import com.github.catvod.spider.p000mergexbpq.P.w;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.l0;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.j;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.r.EnumC0143b;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.I0.ۦۧۥ۟, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0020 {

    /* renamed from: ۢۢۤ, reason: not valid java name and contains not printable characters */
    public static int f460 = -258;

    /* renamed from: ۣ۟۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static String m4196(Object obj, Object obj2) {
        if (C0053.m8389() >= 0) {
            return PanSou.b((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۟۟ۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4197(Object obj) {
        if (C0025.m4797() >= 0) {
            return Boolean.parseBoolean((String) obj);
        }
        return false;
    }

    /* renamed from: ۟۟ۦۨۤ, reason: not valid java name and contains not printable characters */
    public static void m4198(Object obj) {
        if (C0045.m7538() <= 0) {
            C0000.m1126((WebView) obj, C0046.m7724(), null);
        }
    }

    /* renamed from: ۟۟ۨۧۥ, reason: not valid java name and contains not printable characters */
    public static k0 m4200() {
        if (C0030.m5375() > 0) {
            return l0.c;
        }
        return null;
    }

    /* renamed from: ۟۠۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static AlertDialog.Builder m4201(Object obj, Object obj2, Object obj3) {
        if (C0042.m7147() <= 0) {
            return ((AlertDialog.Builder) obj).setNeutralButton((CharSequence) obj2, (DialogInterface.OnClickListener) obj3);
        }
        return null;
    }

    /* renamed from: ۟۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m4202() {
        if (C0031.m5628() >= 0) {
            return "安全验证";
        }
        return null;
    }

    /* renamed from: ۟۠ۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4203() {
        if (C0039.m6529() < 0) {
            return n.c;
        }
        return false;
    }

    /* renamed from: ۟۠ۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Map m4204(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((HBrren) obj).getHeaders();
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static EnumC0143b m4205() {
        if (C0053.m8389() > 0) {
            return EnumC0143b.d;
        }
        return null;
    }

    /* renamed from: ۟۠ۨۤ۟, reason: not valid java name and contains not printable characters */
    public static void m4206(Object obj, int i) {
        if (C0004.m1557() < 0) {
            ((TextView) obj).setMinLines(i);
        }
    }

    /* renamed from: ۣ۟۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static String m4207(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((WebSettings) obj).getUserAgentString();
        }
        return null;
    }

    /* renamed from: ۟ۡۢۡۥ, reason: not valid java name and contains not printable characters */
    public static int m4208(Object obj) {
        if (C0053.m8389() >= 0) {
            return ((com.github.catvod.spider.merge.d0.c) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۡۢۢ۟, reason: not valid java name and contains not printable characters */
    public static Map m4209(Object obj) {
        if (C0048.m7971() > 0) {
            return ((HBgetapp) obj).getHeaders();
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m4210() {
        return 533 ^ C0048.f769;
    }

    /* renamed from: ۟ۢ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m4211(Object obj) {
        if (C0064.m9659() < 0) {
            ((AbstractC0368a) obj).releaseIntercepted();
        }
    }

    /* renamed from: ۟ۢۡۡۡ, reason: not valid java name and contains not printable characters */
    public static String m4212(Object obj, Object obj2, int i) {
        if (C0028.m5152() <= 0) {
            return ((Baidu) obj).detailContentVodPlayFrom((List) obj2, i);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۢ۟, reason: not valid java name and contains not printable characters */
    public static int m4213(Object obj) {
        if (C0032.m5686() < 0) {
            return ((C0145b) obj).d;
        }
        return 0;
    }

    /* renamed from: ۟ۢۢۧۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4214(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((NG) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۢۥۡۢ, reason: not valid java name and contains not printable characters */
    public static String m4215() {
        if (C0019.m4065() < 0) {
            return "Origin";
        }
        return null;
    }

    /* renamed from: ۟ۢۥۨۦ, reason: not valid java name and contains not printable characters */
    public static String m4216(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0035.m6140() <= 0) {
            return g.m((Integer) obj, (Integer) obj2, (Integer) obj3, (Integer) obj4, (ArrayList) obj5);
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static void m4217(Object obj, Object obj2) {
        if (m4210() <= 0) {
            f.L((String) obj, (String) obj2);
        }
    }

    /* renamed from: ۣ۟۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static HashMap m4218() {
        if (C0053.m8389() > 0) {
            return DaGongRen.a();
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static Object m4219(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.k.c) obj).getResult();
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۧۥ, reason: not valid java name and contains not printable characters */
    public static Pattern m4220() {
        if (C0058.m9131() < 0) {
            return com.github.catvod.spider.merge.T0.a.g;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static Object m4221(Object obj) {
        if (C0014.m3353() < 0) {
            return ((h) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۤۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4222(Object obj, int i) {
        if (C0052.m8320() > 0) {
            return ((j) obj).d(i);
        }
        return false;
    }

    /* renamed from: ۟ۤۨۨۢ, reason: not valid java name and contains not printable characters */
    public static String m4223(Object obj) {
        if (C0047.m7837() > 0) {
            return ((Config) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۥ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static Object m4224(Object obj) {
        if (C0034.m6048() < 0) {
            return ((p) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۥۣ۠ۦ, reason: not valid java name and contains not printable characters */
    public static int m4225(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.c) obj).size();
        }
        return 0;
    }

    /* renamed from: ۟ۥ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m4226(Object obj, Object obj2) {
        if (C0013.m3167() >= 0) {
            ((g) obj).x((ArrayList) obj2);
        }
    }

    /* renamed from: ۟ۥۢۨۤ, reason: not valid java name and contains not printable characters */
    public static List m4227() {
        if (C0029.m5282() >= 0) {
            return r.c;
        }
        return null;
    }

    /* renamed from: ۟ۥۣۤۢ, reason: not valid java name and contains not printable characters */
    public static void m4228(Object obj) {
        if (C0028.m5152() < 0) {
            ((com.github.catvod.spider.merge.V0.p) obj).f();
        }
    }

    /* renamed from: ۟ۥۤۧ۟, reason: not valid java name and contains not printable characters */
    public static String m4229(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((i) obj).a();
        }
        return null;
    }

    /* renamed from: ۟ۥۥۢۨ, reason: not valid java name and contains not printable characters */
    public static String m4230(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((HBT4) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۥۧۧ۠, reason: not valid java name and contains not printable characters */
    public static D m4231(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((w) obj).q();
        }
        return null;
    }

    /* renamed from: ۟ۥۨۤۨ, reason: not valid java name and contains not printable characters */
    public static WindowInsets.Builder m4232(Object obj, int i, boolean z) {
        if (C0001.m1164() <= 0) {
            return ((WindowInsets.Builder) obj).setVisible(i, z);
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static C0168z m4233(Object obj) {
        if (C0033.m5872() > 0) {
            return ((d) obj).f;
        }
        return null;
    }

    /* renamed from: ۟ۦۡۥ۟, reason: not valid java name and contains not printable characters */
    public static JSONObject m4234(Object obj, Object obj2, double d) {
        if (C0017.m3633() <= 0) {
            return ((JSONObject) obj).put((String) obj2, d);
        }
        return null;
    }

    /* renamed from: ۟ۦۧۦۣ, reason: not valid java name and contains not printable characters */
    public static String m4235() {
        if (C0010.m2320() < 0) {
            return "番剧";
        }
        return null;
    }

    /* renamed from: ۟ۧۢۧۨ, reason: not valid java name and contains not printable characters */
    public static String m4236(Object obj, int i) {
        if (C0028.m5152() < 0) {
            return ((BigInteger) obj).toString(i);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۥ, reason: not valid java name and contains not printable characters */
    public static int m4237(Object obj) {
        if (C0060.m9355() > 0) {
            return ((C0254o) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۧۤۢ۠, reason: not valid java name and contains not printable characters */
    public static ProgressDialog m4238() {
        if (C0012.m3024() > 0) {
            return Config.l;
        }
        return null;
    }

    /* renamed from: ۟ۧۧۦۢ, reason: not valid java name and contains not printable characters */
    public static String m4239() {
        if (C0039.m6529() < 0) {
            return "调试->getDescInfo出错：";
        }
        return null;
    }

    /* renamed from: ۠۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static Map m4240(Object obj) {
        if (C0045.m7538() < 0) {
            return ((NG.PlayRst) obj).b;
        }
        return null;
    }

    /* renamed from: ۠۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static String m4241(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((Config) obj).e;
        }
        return null;
    }

    /* renamed from: ۠ۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m4242(Object obj, Object obj2, int i) {
        if (C0026.m4977() < 0) {
            ((t) obj).f((ImageButton) obj2, i);
        }
    }

    /* renamed from: ۠ۦۥۣ, reason: not valid java name and contains not printable characters */
    public static long m4243(Object obj) {
        if (C0007.m1886() > 0) {
            return ((com.github.catvod.spider.merge.d0.d) obj).l;
        }
        return 0L;
    }

    /* renamed from: ۠ۦۨۦ, reason: not valid java name and contains not printable characters */
    public static String m4244(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0024.m4693() < 0) {
            return ((L) obj).a((String) obj2, (Map) obj3, (Map) obj4, (Integer) obj5, (String) obj6);
        }
        return null;
    }

    /* renamed from: ۣ۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4245(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((File) obj).canExecute();
        }
        return false;
    }

    /* renamed from: ۣۡۢۨ, reason: not valid java name and contains not printable characters */
    public static String m4246(Object obj) {
        if (C0063.m9589() <= 0) {
            return ((RunnableC0325e) obj).c;
        }
        return null;
    }

    /* renamed from: ۡۤۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m4247(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((com.github.catvod.spider.merge.W.h) obj).b;
        }
        return null;
    }

    /* renamed from: ۡۤۧ, reason: not valid java name and contains not printable characters */
    public static void m4248(Object obj, Object obj2, boolean z) {
        if (C0012.m3024() >= 0) {
            com.github.catvod.spider.merge.S0.b.a((StringBuilder) obj, (String) obj2, z);
        }
    }

    /* renamed from: ۡۧۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4249(Object obj, Object obj2) {
        if (C0002.m1242() >= 0) {
            ((com.github.catvod.spider.merge.E.h) obj).c((String) obj2);
        }
    }

    /* renamed from: ۣۢ۠ۨ, reason: not valid java name and contains not printable characters */
    public static int[] m4250(Object obj) {
        if (C0043.m7332() > 0) {
            return ((Drawable) obj).getState();
        }
        return null;
    }

    /* renamed from: ۢۢۦۢ, reason: not valid java name and contains not printable characters */
    public static HashMap m4251(Object obj, Object obj2) {
        if (C0026.m4977() < 0) {
            return com.github.catvod.spider.merge.B0.a.s((String) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۢۢۨۥ, reason: not valid java name and contains not printable characters */
    public static N m4252(Object obj) {
        if (C0040.m6582() > 0) {
            return ((M) obj).j;
        }
        return null;
    }

    /* renamed from: ۢۦۣ۟, reason: not valid java name and contains not printable characters */
    public static String m4253(Object obj) {
        if (C0063.m9589() < 0) {
            return e.q((String) obj);
        }
        return null;
    }

    /* renamed from: ۣۣۢۧ, reason: not valid java name and contains not printable characters */
    public static Notice m4254(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((o) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static byte m4255(Object obj) {
        if (C0058.m9131() < 0) {
            return ((com.github.catvod.spider.merge.K0.c) obj).a;
        }
        return (byte) 0;
    }

    /* renamed from: ۣ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static void m4256(Object obj, Object obj2) {
        if (C0035.m6140() < 0) {
            ((com.github.catvod.spider.merge.E0.o) obj).d((com.github.catvod.spider.merge.E0.p) obj2);
        }
    }

    /* renamed from: ۣ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m4257(char c, char c2) {
        if (C0017.m3633() <= 0) {
            return Character.toCodePoint(c, c2);
        }
        return 0;
    }

    /* renamed from: ۣ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static String m4258(Object obj) {
        if (C0044.m7508() < 0) {
            return ((Xb6v) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۣ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m4259(Object obj) {
        if (C0017.m3633() <= 0) {
            ((Jianpian) obj).Setimgurl();
        }
    }

    /* renamed from: ۣۤۡۦ, reason: not valid java name and contains not printable characters */
    public static String m4260(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((RunnableC0317F) obj).e;
        }
        return null;
    }

    /* renamed from: ۣۥۡۧ, reason: not valid java name and contains not printable characters */
    public static String m4261(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((Long) obj).toString();
        }
        return null;
    }

    /* renamed from: ۣۥۡۨ, reason: not valid java name and contains not printable characters */
    public static String m4262(Object obj) {
        if (C0029.m5282() > 0) {
            return ((com.github.catvod.spider.merge.N0.b) obj).f;
        }
        return null;
    }

    /* renamed from: ۣۥۥۣ, reason: not valid java name and contains not printable characters */
    public static int m4263(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۣۦۡۥ, reason: not valid java name and contains not printable characters */
    public static String m4264(Object obj, Object obj2) {
        if (C0056.m8886() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d0.D) obj).a((String) obj2);
        }
        return null;
    }

    /* renamed from: ۤۥۨۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4265(Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2, boolean z3) {
        if (C0015.m3433() > 0) {
            return ((C0166x) obj).d((com.github.catvod.spider.merge.E0.c) obj2, (C0164v) obj3, (K) obj4, z, z2, z3);
        }
        return false;
    }

    /* renamed from: ۤۧۢۥ, reason: not valid java name and contains not printable characters */
    public static HashMap m4266(Object obj) {
        if (C0015.m3433() > 0) {
            return ((C0233B) obj).e;
        }
        return null;
    }

    /* renamed from: ۥۡۢۥ, reason: contains not printable characters */
    public static void m4267(Object obj) throws IOException {
        if (C0014.m3353() < 0) {
            ((BufferedWriter) obj).close();
        }
    }

    /* renamed from: ۥۢۨ۠, reason: contains not printable characters */
    public static com.github.catvod.spider.merge.V.b m4268(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((HBDmSou) obj).d;
        }
        return null;
    }

    /* renamed from: ۥۣ۠ۦ, reason: contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.d.c m4269(Object obj) {
        if (C0006.m1726() < 0) {
            return ((com.github.catvod.spider.p000mergexbpq.d.c) obj).b();
        }
        return null;
    }

    /* renamed from: ۥۣۧ, reason: contains not printable characters */
    public static String m4270() {
        if (C0012.m3024() >= 0) {
            return "class";
        }
        return null;
    }

    /* renamed from: ۥۥۨۡ, reason: contains not printable characters */
    public static String m4271(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * 10)) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۥۧ۠ۦ, reason: contains not printable characters */
    public static int m4272(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((DialogInterfaceOnClickListenerC0226b) obj).a;
        }
        return 0;
    }

    /* renamed from: ۥۨۡۦ, reason: contains not printable characters */
    public static void m4273(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0028.m5152() < 0) {
            ((C0246g) obj).p((String) obj2, (com.github.catvod.spider.merge.F.h) obj3, (ArrayList) obj4, (ArrayList) obj5, (String) obj6);
        }
    }

    /* renamed from: ۦ۠ۦۦ, reason: contains not printable characters */
    public static String m4274() {
        if (C0001.m1164() < 0) {
            return ")";
        }
        return null;
    }

    /* renamed from: ۦۡۤۤ, reason: contains not printable characters */
    public static int m4275(Object obj) {
        if (C0046.m7701() > 0) {
            return ((C0320I) obj).a;
        }
        return 0;
    }

    /* renamed from: ۦۢ۟ۥ, reason: contains not printable characters */
    public static Object m4276(Object obj, Object obj2) {
        if (C0015.m3433() > 0) {
            return ((b) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۦۣ۠ۥ, reason: contains not printable characters */
    public static float m4277(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((SizeF) obj).getWidth();
        }
        return 0.0f;
    }

    /* renamed from: ۦۦۡۦ, reason: contains not printable characters */
    public static int m4278(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((RunnableC0239H) obj).a;
        }
        return 0;
    }

    /* renamed from: ۦۦۤۨ, reason: contains not printable characters */
    public static WeakReference m4279(Object obj) {
        if (C0028.m5152() < 0) {
            return ((C0288g) obj).a;
        }
        return null;
    }

    /* renamed from: ۧۡۨۧ, reason: not valid java name and contains not printable characters */
    public static int m4280(Object obj) {
        if (C0046.m7701() > 0) {
            return ((C0342b) obj).a;
        }
        return 0;
    }

    /* renamed from: ۧۤۢۤ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m4281(Object obj) {
        if (C0032.m5686() <= 0) {
            return ((I) obj).b;
        }
        return null;
    }

    /* renamed from: ۧۤۦۥ, reason: not valid java name and contains not printable characters */
    public static String m4282() {
        if (C0045.m7538() <= 0) {
            return "跳转播放链接";
        }
        return null;
    }

    /* renamed from: ۧۥۥۢ, reason: not valid java name and contains not printable characters */
    public static void m4283(Object obj) {
        if (C0018.m3956() > 0) {
            ((WebView) obj).pauseTimers();
        }
    }

    /* renamed from: ۧۧۧۤ, reason: not valid java name and contains not printable characters */
    public static Cipher m4284(Object obj) {
        if (C0030.m5375() > 0) {
            return Cipher.getInstance((String) obj);
        }
        return null;
    }

    /* renamed from: ۨ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static Object[] m4285(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((com.github.catvod.spider.merge.M0.f) obj).b;
        }
        return null;
    }

    /* renamed from: ۨۢۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4286(Object obj) {
        if (C0046.m7701() >= 0) {
            ((g) obj).h();
        }
    }

    /* renamed from: ۨۤۨۧ, reason: not valid java name and contains not printable characters */
    public static StringBuffer m4287(Object obj, Object obj2) {
        if (C0022.m4497() >= 0) {
            return ((Matcher) obj).appendTail((StringBuffer) obj2);
        }
        return null;
    }

    /* renamed from: ۨۦۡۢ, reason: not valid java name and contains not printable characters */
    public static void m4288(Object obj, long j) {
        if (C0032.m5686() <= 0) {
            ((Calendar) obj).setTimeInMillis(j);
        }
    }

    /* renamed from: ۟۟ۨۥۤ, reason: not valid java name and contains not printable characters */
    public static String m4199(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}