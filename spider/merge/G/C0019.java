package com.github.catvod.spider.merge.G;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.net.Uri;
import android.text.PrecomputedText;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.github.catvod.spider.Cloud;
import com.github.catvod.spider.Douban;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.HB360;
import com.github.catvod.spider.HBxluo;
import com.github.catvod.spider.JustLive;
import com.github.catvod.spider.MYzhiqiu;
import com.github.catvod.spider.PTT;
import com.github.catvod.spider.Quark;
import com.github.catvod.spider.Tianyi;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.l;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.E0.k;
import com.github.catvod.spider.merge.F.n;
import com.github.catvod.spider.merge.F.o;
import com.github.catvod.spider.merge.F.p;
import com.github.catvod.spider.merge.F0.AbstractC0152i;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0163u;
import com.github.catvod.spider.merge.F0.Q;
import com.github.catvod.spider.merge.F0.d0;
import com.github.catvod.spider.merge.F0.l0;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.U0.C0174a;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.q;
import com.github.catvod.spider.merge.W.u;
import com.github.catvod.spider.merge.W.w;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0232A;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.RunnableC0241b;
import com.github.catvod.spider.merge.a1.h;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0275e;
import com.github.catvod.spider.merge.e0.RunnableC0282a;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f.C0292c;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0309d;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.m0.C0353a;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.P.InterfaceC0066d;
import com.github.catvod.spider.p000mergexbpq.P.r;
import com.github.catvod.spider.p000mergexbpq.P.s;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.D;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.S.i;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b.g;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.d0.F;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.io.Reader;
import java.lang.reflect.Type;
import java.text.ParsePosition;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.G.ۨۤۨۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0019 {

    /* renamed from: ۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static int f446 = -574;

    /* renamed from: ۣ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m4022(Object obj) {
        if (C0032.m5686() <= 0) {
            return com.github.catvod.spider.p000mergexbpq.W.a.b((Throwable) obj);
        }
        return null;
    }

    /* renamed from: ۟۟ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static q m4023(Object obj) {
        if (C0052.m8320() > 0) {
            return q.d((Activity) obj);
        }
        return null;
    }

    /* renamed from: ۟۟ۤۡ۠, reason: not valid java name and contains not printable characters */
    public static long m4024(Object obj) {
        if (C0007.m1886() > 0) {
            return ((com.github.catvod.spider.merge.d0.d) obj).h;
        }
        return 0L;
    }

    /* renamed from: ۟۟ۦۣ۠, reason: not valid java name and contains not printable characters */
    public static String m4025(Object obj) {
        if (C0012.m3024() > 0) {
            return ((Uri) obj).getPath();
        }
        return null;
    }

    /* renamed from: ۟۟ۦۢ۠, reason: not valid java name and contains not printable characters */
    public static String m4026() {
        if (C0008.m1975() > 0) {
            return "/proxy?do=seachdanmu&go=dianshisaoma')\n                .then(r => r.text())\n                .then(text => showStatus(text || '✅ 扫码请求已发送，请打开电视端扫码', 'success'))\n                .catch(() => showStatus('❌ 推送失败，请检查服务是否运行', 'failure'));\n        }\n\n        // 切换弹幕面板\n        toggleDanmuBtn.addEventListener('click', toggleDanmuPanel);\n        \n        function toggleDanmuPanel() {\n            if (isPanelVisible) {\n                // 隐藏面板并从DOM中移除\n                if (danmuPanel && danmuPanel.parentNode) {\n                    danmuPanel.parentNode.removeChild(danmuPanel);\n                }\n                danmuPanel = null;\n                toggleDanmuBtn.innerHTML = '<i class=\"fas fa-comment-dots\"></i> 发弹幕';\n            } else {\n                // 创建并显示面板\n                createDanmuPanel();\n                toggleDanmuBtn.innerHTML = '<i class=\"fas fa-eye-slash\"></i> 隐藏面板';\n            }\n            isPanelVisible = !isPanelVisible;\n        }\n        \n        // 创建弹幕面板\n        function createDanmuPanel() {\n            // 创建面板容器\n            danmuPanel = document.createElement('div');\n            danmuPanel.id = 'danmuPanel';\n            \n            // 设置面板内容\n            danmuPanel.innerHTML = `\n                <textarea id=\"danmuMessage\" placeholder=\"输入弹幕内容\" rows=\"2\" tabindex=\"0\"></textarea>\n                <div style=\"margin-bottom: 8px; font-size: 13px;\">\n                    <label for=\"danmuUsername\" style=\"display: inline-block; width: 50px;\">昵称：</label>\n                    <input type=\"text\" id=\"danmuUsername\" placeholder=\"输入昵称\" value=\"";
        }
        return null;
    }

    /* renamed from: ۟۟ۧۡۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4027(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((C0233B) obj).h;
        }
        return false;
    }

    /* renamed from: ۣ۟۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m4028(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((ByteArrayOutputStream) obj).toByteArray();
        }
        return null;
    }

    /* renamed from: ۟۠۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4029(Object obj, float f) {
        if (C0057.m9017() >= 0) {
            ((Paint) obj).setTextSize(f);
        }
    }

    /* renamed from: ۟۠ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static String m4030() {
        if (C0048.m7971() > 0) {
            return "Xpath方式未获取到播放列表！";
        }
        return null;
    }

    /* renamed from: ۟۠ۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m4031(Object obj) {
        if (C0029.m5282() > 0) {
            return Douban.b((JSONArray) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static String m4032() {
        if (C0035.m6140() <= 0) {
            return h.b();
        }
        return null;
    }

    /* renamed from: ۟۠ۥ۟۟, reason: not valid java name and contains not printable characters */
    public static String m4033(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0031.m5628() >= 0) {
            return ((Cloud) obj).playerContent((String) obj2, (String) obj3, (List) obj4);
        }
        return null;
    }

    /* renamed from: ۟۠ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static int m4034(int i) {
        if (C0006.m1726() <= 0) {
            return Color.blue(i);
        }
        return 0;
    }

    /* renamed from: ۣ۟۠ۧۨ, reason: not valid java name and contains not printable characters */
    public static Reader m4035(Object obj) {
        if (C0032.m5686() < 0) {
            return ((C0174a) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m4036(char c, int i) {
        if (C0051.m8216() < 0) {
            return Character.digit(c, i);
        }
        return 0;
    }

    /* renamed from: ۟ۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m4037(Object obj) {
        if (C0005.m1599() < 0) {
            return ((C0275e) obj).c;
        }
        return 0;
    }

    /* renamed from: ۣۣ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.L.a m4038(Object obj) {
        if (C0052.m8320() > 0) {
            return ((C0232A) obj).i;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۨۡ, reason: not valid java name and contains not printable characters */
    public static int m4039(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.Q.a) obj).d();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static void m4040(Object obj) {
        if (C0032.m5686() < 0) {
            ((View) obj).requestLayout();
        }
    }

    /* renamed from: ۟ۡۥ۠۠, reason: not valid java name and contains not printable characters */
    public static String m4041() {
        if (C0029.m5282() > 0) {
            return "$sub:";
        }
        return null;
    }

    /* renamed from: ۟ۡۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m4042(Object obj) {
        if (C0006.m1726() < 0) {
            return AbstractC0309d.a((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۡۧۡۨ, reason: not valid java name and contains not printable characters */
    public static PrintStream m4043(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0034.m6048() <= 0) {
            return ((PrintStream) obj).format((Locale) obj2, (String) obj3, (Object[]) obj4);
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static void m4044(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0029.m5282() >= 0) {
            ((C0254o) obj).o((String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6);
        }
    }

    /* renamed from: ۟ۢۢۦ, reason: not valid java name and contains not printable characters */
    public static String m4045(Object obj, Object obj2) {
        if (C0050.m8121() <= 0) {
            return ((InterfaceC0066d) obj).h((i) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۤۧ, reason: not valid java name and contains not printable characters */
    public static void m4046(Object obj, Object obj2, Object obj3, int i) {
        if (C0003.m1463() <= 0) {
            ((D) obj).b((s) obj2, (InterfaceC0066d) obj3, i);
        }
    }

    /* renamed from: ۣ۟۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static String m4047(boolean z) {
        if (C0025.m4797() > 0) {
            return String.valueOf(z);
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static void m4048(Object obj, float f, float f2, float f3, int i) {
        if (C0026.m4977() < 0) {
            ((TextView) obj).setShadowLayer(f, f2, f3, i);
        }
    }

    /* renamed from: ۣ۟ۢۥۡ, reason: not valid java name and contains not printable characters */
    public static String m4049(Object obj) {
        if (C0002.m1242() > 0) {
            return ((PTT) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۧ۟, reason: not valid java name and contains not printable characters */
    public static void m4050(Object obj, boolean z) {
        if (C0003.m1463() < 0) {
            ((WebSettings) obj).setUseWideViewPort(z);
        }
    }

    /* renamed from: ۣ۟ۨۧۢ, reason: not valid java name and contains not printable characters */
    public static String m4051(Object obj) {
        if (C0056.m8886() < 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).c0;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۠ۧ, reason: not valid java name and contains not printable characters */
    public static int m4052(Object obj) {
        if (C0001.m1164() < 0) {
            return ((u) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۤۡۦ۠, reason: not valid java name and contains not printable characters */
    public static void m4053(Object obj, int i) {
        if (C0049.m8038() < 0) {
            ((r) obj).d(i);
        }
    }

    /* renamed from: ۟ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m4054(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((F) obj).g();
        }
        return false;
    }

    /* renamed from: ۟ۤۦ۟ۢ, reason: not valid java name and contains not printable characters */
    public static ImageButton m4055(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((w) obj).e;
        }
        return null;
    }

    /* renamed from: ۟ۥۣۡۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m4056() {
        if (C0018.m3956() > 0) {
            return HBxluo.a();
        }
        return null;
    }

    /* renamed from: ۟ۥۣ, reason: not valid java name and contains not printable characters */
    public static boolean m4057(Object obj) {
        if (C0033.m5872() > 0) {
            return ((AccessibilityNodeInfo) obj).isContentInvalid();
        }
        return false;
    }

    /* renamed from: ۟ۥۨ۠ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4058(Object obj, Object obj2) {
        if (C0055.m8740() >= 0) {
            return ((Q) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۟ۦ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m4059(Object obj, Object obj2) {
        if (C0062.m9429() > 0) {
            ((c) obj).m((String) obj2);
        }
    }

    /* renamed from: ۟ۦۤۢ, reason: not valid java name and contains not printable characters */
    public static Object m4060(Object obj, Object obj2) {
        if (C0064.m9659() < 0) {
            return ((com.github.catvod.spider.merge.X0.s) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۧۥۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4061(Object obj) {
        if (C0001.m1164() < 0) {
            return ((ActivityManager) obj).isLowRamDevice();
        }
        return false;
    }

    /* renamed from: ۟ۦۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static File m4062() {
        if (C0060.m9355() >= 0) {
            return com.github.catvod.spider.merge.W.s.f;
        }
        return null;
    }

    /* renamed from: ۟ۧۢ۠, reason: not valid java name and contains not printable characters */
    public static String m4063() {
        if (C0022.m4497() >= 0) {
            return "3-";
        }
        return null;
    }

    /* renamed from: ۟ۧۢۡۤ, reason: not valid java name and contains not printable characters */
    public static int m4064(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((k) obj).o;
        }
        return 0;
    }

    /* renamed from: ۣۣ۟ۧۤ, reason: not valid java name and contains not printable characters */
    public static int m4065() {
        return 915 ^ C0048.f769;
    }

    /* renamed from: ۟ۧۥۣ۠, reason: not valid java name and contains not printable characters */
    public static Path.Op m4066() {
        if (C0049.m8038() < 0) {
            return Path.Op.DIFFERENCE;
        }
        return null;
    }

    /* renamed from: ۟ۧۥۣۧ, reason: not valid java name and contains not printable characters */
    public static String m4067(Object obj, Object obj2) {
        if (C0047.m7837() >= 0) {
            return ((Quark) obj).detailContentVodPlayUrl((List) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static Object m4068(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((RunnableC0241b) obj).c;
        }
        return null;
    }

    /* renamed from: ۠۠۠۟, reason: not valid java name and contains not printable characters */
    public static String m4069() {
        if (C0017.m3633() <= 0) {
            return "影片地区";
        }
        return null;
    }

    /* renamed from: ۣ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static String m4070() {
        if (C0042.m7147() < 0) {
            return "</button>\n";
        }
        return null;
    }

    /* renamed from: ۣ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m4071(Object obj, int i, Object obj2) {
        if (C0008.m1975() > 0) {
            return ((StringBuilder) obj).insert(i, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۤ۟ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m4072(Object obj) {
        if (C0062.m9429() > 0) {
            return ((AccessibilityNodeInfo) obj).isContextClickable();
        }
        return false;
    }

    /* renamed from: ۠ۤۦۨ, reason: not valid java name and contains not printable characters */
    public static void m4073(Object obj, Object obj2) {
        if (C0003.m1463() <= 0) {
            ((m) obj).n((String) obj2);
        }
    }

    /* renamed from: ۠ۥۣۧ, reason: not valid java name and contains not printable characters */
    public static String m4074(Object obj, Object obj2, Object obj3) {
        if (C0049.m8038() < 0) {
            return ((MYzhiqiu) obj).h((String) obj2, (JSONObject) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static String m4075(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((p) obj).b();
        }
        return null;
    }

    /* renamed from: ۠ۨۡۥ, reason: not valid java name and contains not printable characters */
    public static String m4076(Object obj) {
        if (C0007.m1886() >= 0) {
            return com.github.catvod.spider.merge.V.a.e((String) obj);
        }
        return null;
    }

    /* renamed from: ۠ۨۥۤ, reason: not valid java name and contains not printable characters */
    public static void m4077(Object obj, Object obj2, Object obj3) {
        if (C0035.m6140() < 0) {
            ((Tianyi) obj).init((Context) obj2, (String) obj3);
        }
    }

    /* renamed from: ۡ۟ۦۢ, reason: not valid java name and contains not printable characters */
    public static char[] m4078(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((String) obj).toCharArray();
        }
        return null;
    }

    /* renamed from: ۡۡۥ, reason: not valid java name and contains not printable characters */
    public static int m4079(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((l) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۡۢۧ, reason: not valid java name and contains not printable characters */
    public static void m4080(Object obj) {
        if (C0023.m4566() <= 0) {
            ((w) obj).a();
        }
    }

    /* renamed from: ۣۡۤ۟, reason: not valid java name and contains not printable characters */
    public static String m4081() {
        if (C0007.m1886() > 0) {
            return "\\,";
        }
        return null;
    }

    /* renamed from: ۣۡۤۤ, reason: not valid java name and contains not printable characters */
    public static void m4082(Object obj, Object obj2) {
        if (C0048.m7971() >= 0) {
            com.github.catvod.spider.merge.g0.e.B((File) obj, (File) obj2);
        }
    }

    /* renamed from: ۡۦۣۡ, reason: not valid java name and contains not printable characters */
    public static Runnable m4083(Object obj) {
        if (C0003.m1463() < 0) {
            return ((C0292c) obj).a;
        }
        return null;
    }

    /* renamed from: ۢ۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static i m4084(Object obj, Object obj2) {
        if (C0017.m3633() < 0) {
            return ((i) obj).c((i) obj2);
        }
        return null;
    }

    /* renamed from: ۣۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static d0 m4085(Object obj, Object obj2, Object obj3) {
        if (C0036.m6252() > 0) {
            return ((d0) obj).d((com.github.catvod.spider.merge.E0.s) obj2, (com.github.catvod.spider.merge.E0.p) obj3);
        }
        return null;
    }

    /* renamed from: ۣۢۢ۠, reason: not valid java name and contains not printable characters */
    public static void m4086(Object obj, int i) {
        if (C0045.m7538() < 0) {
            ((TextView) obj).setMarqueeRepeatLimit(i);
        }
    }

    /* renamed from: ۣۢ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m4087(Object obj) {
        if (C0010.m2320() < 0) {
            return ((com.github.catvod.spider.merge.R.a) obj).B;
        }
        return null;
    }

    /* renamed from: ۣۢۦۦ, reason: not valid java name and contains not printable characters */
    public static int m4088(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۢۦۨۦ, reason: not valid java name and contains not printable characters */
    public static int m4089(int i) {
        if (C0050.m8121() <= 0) {
            return Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    /* renamed from: ۢۦۨۧ, reason: not valid java name and contains not printable characters */
    public static String[] m4090(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((HB360) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static JSONObject m4091(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0034.m6048() <= 0) {
            return ((FishHxq) obj).b((String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static int m4092(Object obj) {
        if (C0026.m4977() < 0) {
            return ((com.github.catvod.spider.merge.l0.e) obj).g;
        }
        return 0;
    }

    /* renamed from: ۣ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.U0.D m4093() {
        if (C0016.m3596() < 0) {
            return com.github.catvod.spider.merge.U0.D.c;
        }
        return null;
    }

    /* renamed from: ۣۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static List m4094(Object obj) {
        if (C0024.m4693() < 0) {
            return ((o) obj).c();
        }
        return null;
    }

    /* renamed from: ۣۢ۠, reason: not valid java name and contains not printable characters */
    public static String m4095(String str) {
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
        for (int i3 = 0; i3 < length; i3++) {
            byteArray[i3] = (byte) (byteArray[i3] ^ str2.charAt(i3 % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* renamed from: ۣۤۢۤ, reason: not valid java name and contains not printable characters */
    public static Q m4096(Object obj, Object obj2, boolean z, Object obj3) {
        if (C0033.m5872() > 0) {
            return Q.g((Q) obj, (Q) obj2, z, (C0163u) obj3);
        }
        return null;
    }

    /* renamed from: ۣۥۢۧ, reason: not valid java name and contains not printable characters */
    public static int m4097(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((com.github.catvod.spider.merge.P0.p) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۨۦۥ, reason: not valid java name and contains not printable characters */
    public static boolean m4098(Object obj, Object obj2) {
        if (C0063.m9589() <= 0) {
            return ((com.github.catvod.spider.merge.T0.r) obj).k((String) obj2);
        }
        return false;
    }

    /* renamed from: ۤ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m4099(Object obj) {
        if (C0054.m8557() < 0) {
            return ((RunnableC0282a) obj).c;
        }
        return false;
    }

    /* renamed from: ۤ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static Object m4100(Object obj, Object obj2) {
        if (C0058.m9131() <= 0) {
            return ((com.github.catvod.spider.merge.X0.q) obj).a((com.github.catvod.spider.merge.Y0.c) obj2);
        }
        return null;
    }

    /* renamed from: ۣۤ۟۟, reason: not valid java name and contains not printable characters */
    public static int m4101(int i) {
        if (C0022.m4497() >= 0) {
            return com.github.catvod.spider.merge.l0.f.b(i);
        }
        return 0;
    }

    /* renamed from: ۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Type[] m4102(Object obj) {
        if (C0031.m5628() > 0) {
            return ((Class) obj).getGenericInterfaces();
        }
        return null;
    }

    /* renamed from: ۤۡۨۧ, reason: not valid java name and contains not printable characters */
    public static List m4103(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((M) obj).e;
        }
        return null;
    }

    /* renamed from: ۤۢۧۨ, reason: not valid java name and contains not printable characters */
    public static String m4104(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((com.github.catvod.spider.merge.P.b) obj).b();
        }
        return null;
    }

    /* renamed from: ۣۤۥۨ, reason: not valid java name and contains not printable characters */
    public static void m4105(Object obj) {
        if (C0051.m8216() < 0) {
            ((A) obj).I();
        }
    }

    /* renamed from: ۣۤۦۣ, reason: not valid java name and contains not printable characters */
    public static void m4106(Object obj) {
        if (C0053.m8389() >= 0) {
            ((C0163u) obj).b();
        }
    }

    /* renamed from: ۤۨۥ۠, reason: not valid java name and contains not printable characters */
    public static n m4108(Object obj) {
        if (C0005.m1599() < 0) {
            return ((n) obj).b();
        }
        return null;
    }

    /* renamed from: ۥ۟ۡۡ, reason: contains not printable characters */
    public static Pattern m4109() {
        if (C0046.m7701() >= 0) {
            return com.github.catvod.spider.merge.V0.p.g;
        }
        return null;
    }

    /* renamed from: ۥ۠ۢۧ, reason: contains not printable characters */
    public static String m4110() {
        if (C0022.m4497() > 0) {
            return "搜索模式";
        }
        return null;
    }

    /* renamed from: ۥ۠ۧۢ, reason: contains not printable characters */
    public static int m4111(Object obj, int i) {
        if (C0058.m9131() <= 0) {
            return ((w) obj).b(i);
        }
        return 0;
    }

    /* renamed from: ۥۣۤۤ, reason: contains not printable characters */
    public static EditText m4112(Object obj) {
        if (C0057.m9017() > 0) {
            return ((g) obj).b;
        }
        return null;
    }

    /* renamed from: ۥۥۥۦ, reason: contains not printable characters */
    public static String m4113(Object obj) {
        if (C0052.m8320() > 0) {
            return ((JustLive) obj).a;
        }
        return null;
    }

    /* renamed from: ۥۦۦۨ, reason: contains not printable characters */
    public static boolean m4114(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.R.e) obj).d;
        }
        return false;
    }

    /* renamed from: ۥۧ۠ۤ, reason: contains not printable characters */
    public static Date m4115(Object obj, Object obj2, Object obj3) {
        if (C0023.m4566() < 0) {
            return ((com.github.catvod.spider.merge.P0.n) obj).b((String) obj2, (ParsePosition) obj3);
        }
        return null;
    }

    /* renamed from: ۥۧۦۦ, reason: contains not printable characters */
    public static boolean m4116(Object obj) {
        if (C0028.m5152() < 0) {
            return ((AbstractCollection) obj).isEmpty();
        }
        return false;
    }

    /* renamed from: ۥۣۧۨ, reason: contains not printable characters */
    public static boolean m4117(Object obj) {
        if (C0045.m7538() < 0) {
            return com.github.catvod.spider.merge.g0.e.d((File) obj);
        }
        return false;
    }

    /* renamed from: ۦ۟ۥۨ, reason: contains not printable characters */
    public static int m4118(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((com.github.catvod.spider.merge.V0.g) obj).c;
        }
        return 0;
    }

    /* renamed from: ۦ۠ۥۤ, reason: contains not printable characters */
    public static String m4119() {
        if (C0059.m9257() < 0) {
            return "搜索前";
        }
        return null;
    }

    /* renamed from: ۦۡۤۤ, reason: contains not printable characters */
    public static ScheduledFuture m4120(Object obj, Object obj2, long j, long j2, Object obj3) {
        if (C0026.m4977() <= 0) {
            return ((ScheduledExecutorService) obj).scheduleAtFixedRate((Runnable) obj2, j, j2, (TimeUnit) obj3);
        }
        return null;
    }

    /* renamed from: ۦۦۣ۟, reason: contains not printable characters */
    public static boolean m4121(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((com.github.catvod.spider.merge.U0.M) obj).j;
        }
        return false;
    }

    /* renamed from: ۦۧ۟, reason: contains not printable characters */
    public static StringBuffer m4122(Object obj, long j) {
        if (C0034.m6048() < 0) {
            return ((StringBuffer) obj).append(j);
        }
        return null;
    }

    /* renamed from: ۣۧۦۢ, reason: not valid java name and contains not printable characters */
    public static void m4123(Object obj, boolean z) {
        if (C0056.m8886() < 0) {
            ((AccessibilityNodeInfo) obj).setShowingHintText(z);
        }
    }

    /* renamed from: ۧۧۡۧ, reason: not valid java name and contains not printable characters */
    public static AlertDialog m4124(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((AlertDialog.Builder) obj).show();
        }
        return null;
    }

    /* renamed from: ۣۧۨۤ, reason: not valid java name and contains not printable characters */
    public static HashMap m4125() {
        if (C0058.m9131() <= 0) {
            return JustLive.a();
        }
        return null;
    }

    /* renamed from: ۨۢۧۨ, reason: not valid java name and contains not printable characters */
    public static l0 m4126(Object obj, int i) {
        if (C0008.m1975() >= 0) {
            return ((AbstractC0152i) obj).c(i);
        }
        return null;
    }

    /* renamed from: ۣۨۥۥ, reason: not valid java name and contains not printable characters */
    public static HashMap m4127(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C0054.m8557() < 0) {
            return com.github.catvod.spider.merge.B0.a.t((String) obj, (String) obj2, (String) obj3, (String) obj4);
        }
        return null;
    }

    /* renamed from: ۨۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static WebView m4128() {
        if (C0003.m1463() < 0) {
            return com.github.catvod.spider.merge.W.s.a;
        }
        return null;
    }

    /* renamed from: ۨۦۦۡ, reason: not valid java name and contains not printable characters */
    public static Object[] m4129(Object obj, int i, int i2, Object obj2) {
        if (C0063.m9589() < 0) {
            return ((PrecomputedText) obj).getSpans(i, i2, (Class) obj2);
        }
        return null;
    }

    /* renamed from: ۨۨۨ, reason: not valid java name and contains not printable characters */
    public static String m4130(Object obj) {
        if (C0008.m1975() > 0) {
            return ((C0353a) obj).b;
        }
        return null;
    }

    /* renamed from: ۤۨ۟۠, reason: not valid java name and contains not printable characters */
    public static String m4107(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}