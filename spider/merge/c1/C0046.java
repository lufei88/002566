package com.github.catvod.spider.merge.c1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.Insets;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.widget.ImageView;
import com.github.catvod.spider.AppYsV2;
import com.github.catvod.spider.Ddrk;
import com.github.catvod.spider.XPath;
import com.github.catvod.spider.XPathMac;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.l;
import com.github.catvod.spider.merge.E0.d;
import com.github.catvod.spider.merge.E0.o;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0147d;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.L;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.H0.f;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.P0.h;
import com.github.catvod.spider.merge.P0.n;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.U.p;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.U0.K;
import com.github.catvod.spider.merge.U0.P;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.r;
import com.github.catvod.spider.merge.W.B;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.RunnableC0225a;
import com.github.catvod.spider.merge.W.i;
import com.github.catvod.spider.merge.X0.A;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0281k;
import com.github.catvod.spider.merge.f1.b;
import com.github.catvod.spider.merge.g0.e;
import com.github.catvod.spider.merge.g0.g;
import com.github.catvod.spider.merge.h0.C0332l;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.l0.j;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t0.InterfaceC0370c;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.d0.F;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.net.NetworkInterface;
import java.net.URL;
import java.net.URLConnection;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.ZipFile;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.c1.۟ۡۦۨۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0046 {

    /* renamed from: ۣ۟ۡۧۨ, reason: not valid java name and contains not printable characters */
    public static int f760 = 961;

    /* renamed from: ۟۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static Object[] m7659() {
        if (C0020.m4210() < 0) {
            return C0281k.d;
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7660(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((C0148e) obj).f;
        }
        return false;
    }

    /* renamed from: ۣ۟۠ۥ, reason: not valid java name and contains not printable characters */
    public static Enumeration m7661() {
        if (C0037.m6350() <= 0) {
            return NetworkInterface.getNetworkInterfaces();
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static ImageView.ScaleType m7662() {
        if (C0028.m5152() <= 0) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        return null;
    }

    /* renamed from: ۟۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static boolean m7663(Object obj) {
        if (C0032.m5686() < 0) {
            return ((File) obj).delete();
        }
        return false;
    }

    /* renamed from: ۟۠ۦۦۨ, reason: not valid java name and contains not printable characters */
    public static void m7664(Object obj, int i) {
        if (C0032.m5686() < 0) {
            ((URLConnection) obj).setConnectTimeout(i);
        }
    }

    /* renamed from: ۟ۡ۟۠, reason: not valid java name and contains not printable characters */
    public static int m7665(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((i) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۡ۠ۦۨ, reason: not valid java name and contains not printable characters */
    public static String[] m7666(Object obj) {
        if (C0062.m9429() >= 0) {
            return ((AppYsV2) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۡۤۢۡ, reason: not valid java name and contains not printable characters */
    public static void m7667(Object obj, int i, int i2, int i3, int i4) {
        if (C0026.m4977() < 0) {
            ((View) obj).setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* renamed from: ۣ۟ۡۤ۟, reason: not valid java name and contains not printable characters */
    public static WebView m7668() {
        if (C0035.m6140() < 0) {
            return B.a;
        }
        return null;
    }

    /* renamed from: ۟ۡۨۤۦ, reason: not valid java name and contains not printable characters */
    public static K m7669(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((P) obj).j;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static int m7670(Object obj, Object obj2) {
        if (C0029.m5282() >= 0) {
            return ((Context) obj).checkSelfPermission((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۟ۢۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7671(Object obj) {
        if (C0015.m3433() >= 0) {
            return e.l((String) obj);
        }
        return false;
    }

    /* renamed from: ۣ۟ۢۤۢ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m7672(Object obj, Object obj2, Object obj3) {
        if (C0015.m3433() >= 0) {
            return b.h((String) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۥۤۡ, reason: not valid java name and contains not printable characters */
    public static String m7673() {
        if (C0006.m1726() < 0) {
            return "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">    <title>凡人修仙传集数列表</title>\n     <style>\n  * {\n            margin: 0;\n            padding: 0;\n            box-sizing: border-box;\n        }\n\n        body {\n            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n            background: linear-gradient(135deg, #f8f9ff 0%, #e8f2ff 100%);\n            background: url('";
        }
        return null;
    }

    /* renamed from: ۟ۢۦ۟, reason: not valid java name and contains not printable characters */
    public static void m7674() {
        if (C0005.m1599() < 0) {
            C0012.m3001();
        }
    }

    /* renamed from: ۣ۟ۥۧۡ, reason: not valid java name and contains not printable characters */
    public static String m7675() {
        if (C0031.m5628() > 0) {
            return "$$$通用";
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static CharSequence m7676(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((ShortcutInfo) obj).getShortLabel();
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۥۧ, reason: not valid java name and contains not printable characters */
    public static String m7677(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((com.github.catvod.spider.merge.e1.b) obj).getName();
        }
        return null;
    }

    /* renamed from: ۟ۤۦۧۨ, reason: not valid java name and contains not printable characters */
    public static int m7678(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((DisplayMetrics) obj).heightPixels;
        }
        return 0;
    }

    /* renamed from: ۟ۤۧ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m7679(Object obj) {
        if (C0025.m4797() > 0) {
            ((l) obj).g();
        }
    }

    /* renamed from: ۣ۟ۤۧۤ, reason: not valid java name and contains not printable characters */
    public static String m7680() {
        if (C0037.m6350() <= 0) {
            return "\\|\\|";
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7681(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((n) obj).f;
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۢۥ, reason: not valid java name and contains not printable characters */
    public static int m7682(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۟ۥۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7683(Object obj, Object obj2) {
        if (C0011.m2755() >= 0) {
            return ((View) obj).post((Runnable) obj2);
        }
        return false;
    }

    /* renamed from: ۟ۥۣۣۤ, reason: not valid java name and contains not printable characters */
    public static String m7684(Object obj) {
        if (C0010.m2320() < 0) {
            return ((C0332l) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۥۣۣۦ, reason: not valid java name and contains not printable characters */
    public static h m7685() {
        if (C0041.m6823() < 0) {
            return n.v;
        }
        return null;
    }

    /* renamed from: ۟ۥۣۤۡ, reason: not valid java name and contains not printable characters */
    public static CharSequence m7686(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((ShortcutInfo) obj).getDisabledMessage();
        }
        return null;
    }

    /* renamed from: ۟ۥۤۤۨ, reason: not valid java name and contains not printable characters */
    public static String m7687(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((M) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۥۧ۟, reason: not valid java name and contains not printable characters */
    public static p m7688(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((r) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥۨۦۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m7689(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((o) obj).i;
        }
        return null;
    }

    /* renamed from: ۟ۦۡۦۨ, reason: not valid java name and contains not printable characters */
    public static Object[] m7690(Object obj) {
        if (C0047.m7837() >= 0) {
            return ((C0147d) obj).toArray();
        }
        return null;
    }

    /* renamed from: ۟ۦۢۡۢ, reason: not valid java name and contains not printable characters */
    public static int m7691(Object obj) {
        if (C0050.m8121() < 0) {
            return ((LocaleList) obj).hashCode();
        }
        return 0;
    }

    /* renamed from: ۟ۦۣۤۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.l m7692(Object obj, Object obj2) {
        if (C0033.m5872() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.l) obj).o0((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۦۥۡ, reason: not valid java name and contains not printable characters */
    public static String[] m7693() {
        if (C0019.m4065() <= 0) {
            return C0176b.C;
        }
        return null;
    }

    /* renamed from: ۟ۦۨۥۦ, reason: not valid java name and contains not printable characters */
    public static void m7694(Object obj) {
        if (C0059.m9257() <= 0) {
            ((com.github.catvod.spider.merge.P.b) obj).a();
        }
    }

    /* renamed from: ۟ۦۨۧ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7695(Object obj) {
        if (C0041.m6823() <= 0) {
            return g.l((String) obj);
        }
        return false;
    }

    /* renamed from: ۣ۟ۧ۠۠, reason: not valid java name and contains not printable characters */
    public static d m7696(Object obj, int i) {
        if (C0027.m5017() > 0) {
            return ((o) obj).i(i);
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static String m7697(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((com.github.catvod.spider.merge.L.b) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۧۦۥ۟, reason: not valid java name and contains not printable characters */
    public static void m7698(Object obj) {
        if (C0005.m1599() < 0) {
            ((A) obj).A();
        }
    }

    /* renamed from: ۠۠ۧ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.p m7699(Object obj) {
        if (C0041.m6823() < 0) {
            return ((L) obj).i;
        }
        return null;
    }

    /* renamed from: ۠ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static boolean m7700(Object obj, Object obj2) {
        if (C0029.m5282() > 0) {
            return ((CopyOnWriteArrayList) obj).add(obj2);
        }
        return false;
    }

    /* renamed from: ۡۡۤۤ, reason: not valid java name and contains not printable characters */
    public static int m7701() {
        return (-854) ^ C0058.f846;
    }

    /* renamed from: ۡۢۨۧ, reason: not valid java name and contains not printable characters */
    public static int m7702(Object obj, Object obj2) {
        if (C0032.m5686() <= 0) {
            return m.I((m) obj, (List) obj2);
        }
        return 0;
    }

    /* renamed from: ۡۤۡۨ, reason: not valid java name and contains not printable characters */
    public static CharBuffer m7703(int i) {
        if (C0037.m6350() < 0) {
            return CharBuffer.allocate(i);
        }
        return null;
    }

    /* renamed from: ۡۥۧ۠, reason: not valid java name and contains not printable characters */
    public static long m7704(Object obj) {
        if (C0063.m9589() <= 0) {
            return ((C0233B) obj).n;
        }
        return 0L;
    }

    /* renamed from: ۡۨۤۡ, reason: not valid java name and contains not printable characters */
    public static ImageView.ScaleType m7705() {
        if (C0055.m8740() > 0) {
            return ImageView.ScaleType.CENTER;
        }
        return null;
    }

    /* renamed from: ۣۢ۠, reason: not valid java name and contains not printable characters */
    public static boolean m7706(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((com.github.catvod.spider.merge.G.a) obj).k();
        }
        return false;
    }

    /* renamed from: ۣۢۡۥ, reason: not valid java name and contains not printable characters */
    public static String m7707() {
        if (C0012.m3024() > 0) {
            return "小虎斑弹幕";
        }
        return null;
    }

    /* renamed from: ۢۢ۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m7708() {
        if (C0023.m4566() < 0) {
            return "\\|";
        }
        return null;
    }

    /* renamed from: ۢۢۥ۠, reason: not valid java name and contains not printable characters */
    public static long m7709(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((File) obj).length();
        }
        return 0L;
    }

    /* renamed from: ۢۢۥۣ, reason: not valid java name and contains not printable characters */
    public static int m7710(Object obj, Object obj2) {
        if (C0050.m8121() <= 0) {
            return ((JSONObject) obj).getInt((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۣ۟ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m7711(Object obj, Object obj2) {
        if (C0032.m5686() <= 0) {
            ((com.github.catvod.spider.p000mergexbpq.d0.P) obj).d((String) obj2);
        }
    }

    /* renamed from: ۣ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static Charset m7712() {
        if (C0040.m6582() >= 0) {
            return C0064.m9680();
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static InputStream m7713(Object obj) {
        if (C0018.m3956() > 0) {
            return ((URL) obj).openStream();
        }
        return null;
    }

    /* renamed from: ۤۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static Insets m7714(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((WindowInsets) obj).getMandatorySystemGestureInsets();
        }
        return null;
    }

    /* renamed from: ۤۡۦ۟, reason: not valid java name and contains not printable characters */
    public static Intent m7715(Object obj, Object obj2) {
        if (C0022.m4497() > 0) {
            return ((PackageManager) obj).getLaunchIntentForPackage((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۤ۠ۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m7716() {
        if (C0027.m5017() >= 0) {
            return Ddrk.b();
        }
        return null;
    }

    /* renamed from: ۣۤۨ۟, reason: not valid java name and contains not printable characters */
    public static String m7717(Object obj) {
        if (C0002.m1242() > 0) {
            return ((InterfaceC0370c) obj).c();
        }
        return null;
    }

    /* renamed from: ۥ۠ۥۤ, reason: contains not printable characters */
    public static String m7719() {
        if (C0003.m1463() <= 0) {
            return "\" />\n        </div>\n        <button id=\"sendDanmuBtn\">发送弹幕</button>\n    </div>\n\n    <!-- 操作状态提示 -->\n    <div id=\"statusMessage\" class=\"status-message\"></div>\n\n    <!-- 剧集列表 -->\n    <div class=\"movie-container\">\n\n </div><div style=\"text-align: center; width: 100%; padding: 20px; font-family: Arial, sans-serif; color: #333;\">\n    很抱歉，没有找到您搜索的内容。<br>\n    请尝试使用其他关键词或检查拼写是否正确。\n    </div>\n\n    <div class=\"app-header\">\n        <i class=\"fas fa-tiger fa-2x\"></i>\n        <div class=\"title-group\">\n            <p class=\"subtitle\">主题由老同志制作</p>\n        </div>\n    </div>\n\n    <!-- JavaScript 逻辑 -->\n    <script>\n        // 缓存 DOM 元素\n        const searchInput = document.getElementById('searchInput');\n        const danmuPanel = document.getElementById('danmuPanel');\n        const toggleDanmuBtn = document.getElementById('toggleDanmuBtn');\n        const danmuMessage = document.getElementById('danmuMessage');\n        const danmuUsername = document.getElementById('danmuUsername');\n        const sendDanmuBtn = document.getElementById('sendDanmuBtn');\n        const statusMessage = document.getElementById('statusMessage');\n\n        const focusable = document.querySelectorAll('a[href], button, input, textarea');\n        const focusArray = Array.from(focusable).filter(el => !el.disabled && el.tabIndex !== -1);\n        let currentIndex = 0;\n\n        if (focusArray.length > 0) {\n            focusArray[0].focus();\n        }\n\n        // 搜索处理\n        function handleSearch() {\n            const value = searchInput.value.trim();\n            if (!value) return showStatus('请输入搜索内容', 'failure');\n            const paramName = searchInput.getAttribute('name');\n            const url = `";
        }
        return null;
    }

    /* renamed from: ۥۣۢ۠, reason: contains not printable characters */
    public static boolean m7720(Object obj) {
        if (C0057.m9017() > 0) {
            return ((W) obj).j;
        }
        return false;
    }

    /* renamed from: ۥۣۥۦ, reason: contains not printable characters */
    public static String m7721(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * 10)) ^ i).toString();
            i++;
            str2 = string2;
        }
        while (string.length() > 0) {
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
        return new String(byteArray);
    }

    /* renamed from: ۥۣۨۧ, reason: contains not printable characters */
    public static int m7722(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((f) obj).g();
        }
        return 0;
    }

    /* renamed from: ۥۥ۠ۢ, reason: contains not printable characters */
    public static Enumeration m7723(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((ZipFile) obj).entries();
        }
        return null;
    }

    /* renamed from: ۥۥۦ۠, reason: contains not printable characters */
    public static String m7724() {
        if (C0043.m7332() > 0) {
            return "javascript:(function() {var elements = document.querySelectorAll('a, button, input, select, [onclick], [tabindex]');elements.forEach((el, i) => el.setAttribute('tabindex', i));if(elements.length > 0) elements[0].focus();var style = document.createElement('style');style.innerHTML = '*:focus{outline:3px solid #4096FF;} a:focus, button:focus{background:rgba(64,150,255,0.2);}';document.head.appendChild(style);function getRowInfo(elem) {    var rect = elem.getBoundingClientRect();    var rows = [];    var currentRow = [];    elements.forEach((el, i) => {        var r = el.getBoundingClientRect();        if(Math.abs(r.top - rect.top) > 10) {            if(currentRow.length) rows.push(currentRow);            currentRow = [i]; rect = r;        } else currentRow.push(i);    });    rows.push(currentRow);    return rows;}document.onkeydown = function(e) {    var key = e.keyCode;    if(![37,38,39,40,13,32].includes(key)) return;    e.preventDefault();    var current = document.activeElement;    var idx = Array.from(elements).indexOf(current);    if(idx < 0) return elements[0].focus();    var rows = getRowInfo(current);    var rowIdx = rows.findIndex(r => r.includes(idx));    var posInRow = rows[rowIdx].indexOf(idx);    var nextIdx = idx;    if(key === 39) nextIdx = rows[rowIdx][(posInRow+1)%rows[rowIdx].length]; // 右    if(key === 37) nextIdx = rows[rowIdx][(posInRow-1+rows[rowIdx].length)%rows[rowIdx].length]; // 左    if(key === 40 && rowIdx+1 < rows.length) nextIdx = rows[rowIdx+1][Math.min(posInRow, rows[rowIdx+1].length-1)]; // 下    if(key === 38 && rowIdx > 0) nextIdx = rows[rowIdx-1][Math.min(posInRow, rows[rowIdx-1].length-1)]; // 上    if(key === 13 || key === 32) current.click(); // OK键    if(elements[nextIdx]) elements[nextIdx].focus();};})();";
        }
        return null;
    }

    /* renamed from: ۥۦۧ۟, reason: contains not printable characters */
    public static String m7725(Object obj) {
        if (C0057.m9017() > 0) {
            return ((String) obj).toString();
        }
        return null;
    }

    /* renamed from: ۥۧۢ۟, reason: contains not printable characters */
    public static String m7726() {
        if (C0057.m9017() >= 0) {
            return "=";
        }
        return null;
    }

    /* renamed from: ۥۧۥۡ, reason: contains not printable characters */
    public static void m7727(Object obj, int i) {
        if (C0001.m1164() <= 0) {
            ((j) obj).i(i);
        }
    }

    /* renamed from: ۦ۟۠۠, reason: contains not printable characters */
    public static int m7728(Object obj) {
        if (C0042.m7147() < 0) {
            return ((BitSet) obj).cardinality();
        }
        return 0;
    }

    /* renamed from: ۦۣ۟ۡ, reason: contains not printable characters */
    public static F m7729(Object obj) {
        if (C0040.m6582() > 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.l) obj).m0();
        }
        return null;
    }

    /* renamed from: ۦۡۡ۟, reason: contains not printable characters */
    public static int m7730(Object obj, Object obj2) {
        if (C0043.m7332() >= 0) {
            return ((C0281k) obj).d(obj2);
        }
        return 0;
    }

    /* renamed from: ۦۡۧ۟, reason: contains not printable characters */
    public static Serializable m7731(Object obj) {
        if (C0037.m6350() < 0) {
            return ((com.github.catvod.spider.merge.W.h) obj).e;
        }
        return null;
    }

    /* renamed from: ۦۡۨۢ, reason: contains not printable characters */
    public static void m7732(Object obj) {
        if (C0050.m8121() < 0) {
            ((XPath) obj).c();
        }
    }

    /* renamed from: ۦۢۡ۟, reason: contains not printable characters */
    public static HashMap m7733(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((W) obj).k();
        }
        return null;
    }

    /* renamed from: ۦۢۢۥ, reason: contains not printable characters */
    public static int m7734(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((RunnableC0225a) obj).a;
        }
        return 0;
    }

    /* renamed from: ۦۢۥۣ, reason: contains not printable characters */
    public static void m7735(Object obj) {
        if (C0020.m4210() <= 0) {
            ((A) obj).q();
        }
    }

    /* renamed from: ۦۥۡ۠, reason: contains not printable characters */
    public static ArrayList m7736(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((com.github.catvod.spider.merge.E0.f) obj).b;
        }
        return null;
    }

    /* renamed from: ۦۨۧ, reason: contains not printable characters */
    public static boolean m7737(Object obj) {
        if (C0022.m4497() > 0) {
            return ((XPathMac) obj).c;
        }
        return false;
    }

    /* renamed from: ۨۢۦۢ, reason: not valid java name and contains not printable characters */
    public static String m7738(Object obj) {
        if (C0007.m1886() > 0) {
            return ((com.github.catvod.spider.merge.F.h) obj).b();
        }
        return null;
    }

    /* renamed from: ۨۨۦ, reason: not valid java name and contains not printable characters */
    public static String m7739(Object obj) {
        if (C0039.m6529() < 0) {
            return ((URL) obj).getProtocol();
        }
        return null;
    }

    /* renamed from: ۥۣ۠ۡ, reason: contains not printable characters */
    public static String m7718(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}