package com.github.catvod.spider.merge.W;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.location.GnssStatus;
import android.util.Base64;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import com.github.catvod.spider.AppYsV2;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Ddrk;
import com.github.catvod.spider.HBNG;
import com.github.catvod.spider.HBmengya;
import com.github.catvod.spider.HBwwgg;
import com.github.catvod.spider.MYzhiqiu;
import com.github.catvod.spider.Supjav;
import com.github.catvod.spider.Symx;
import com.github.catvod.spider.Wogg;
import com.github.catvod.spider.XPath;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.AbstractC0152i;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.C0163u;
import com.github.catvod.spider.merge.F0.C0164v;
import com.github.catvod.spider.merge.F0.L;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0173e;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.AbstractC0236E;
import com.github.catvod.spider.merge.a0.AbstractC0258t;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.a0.RunnableC0235D;
import com.github.catvod.spider.merge.a0.RunnableC0241b;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0273c;
import com.github.catvod.spider.merge.e0.C0288g;
import com.github.catvod.spider.merge.e0.ViewOnFocusChangeListenerC0284c;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f.C0295f;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.t0.InterfaceC0370c;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.W.۟ۦۣۦۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0034 {

    /* renamed from: ۣ۟۠, reason: not valid java name and contains not printable characters */
    public static int f663 = 43;

    /* renamed from: ۟۟۟۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m5950(String str) {
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

    /* renamed from: ۟۟۟۠۟, reason: not valid java name and contains not printable characters */
    public static double m5951(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((BigDecimal) obj).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: ۟۟۠ۤۦ, reason: not valid java name and contains not printable characters */
    public static HashMap m5952() {
        if (C0044.m7508() <= 0) {
            return HBwwgg.a();
        }
        return null;
    }

    /* renamed from: ۟۟ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m5953(Object obj) {
        if (C0017.m3633() < 0) {
            ((View) obj).clearAnimation();
        }
    }

    /* renamed from: ۟۟ۢ, reason: not valid java name and contains not printable characters */
    public static String m5954(Object obj) {
        if (C0014.m3353() <= 0) {
            return com.github.catvod.spider.merge.E.l.h((com.github.catvod.spider.merge.G0.d) obj);
        }
        return null;
    }

    /* renamed from: ۟۟ۦۢۦ, reason: not valid java name and contains not printable characters */
    public static String m5955(Object obj) {
        if (C0031.m5628() > 0) {
            return ((HBNG) obj).a;
        }
        return null;
    }

    /* renamed from: ۟۟ۨۡۨ, reason: not valid java name and contains not printable characters */
    public static String m5956(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0053.m8389() >= 0) {
            return ((C0233B) obj).a((String) obj2, (Map) obj3, (Map) obj4, (Integer) obj5, (String) obj6);
        }
        return null;
    }

    /* renamed from: ۟۠۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m5957(Object obj) {
        if (C0062.m9429() > 0) {
            return ((t) obj).j;
        }
        return null;
    }

    /* renamed from: ۟۠۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m5958(Object obj) {
        if (C0051.m8216() < 0) {
            return ((RunnableC0241b) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۠ۦۣ۟, reason: not valid java name and contains not printable characters */
    public static int m5959(Object obj) {
        if (C0013.m3167() > 0) {
            return ((RunnableC0241b) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟۠ۦۤ۠, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.E0.p m5960(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((com.github.catvod.spider.merge.E0.q) obj).b;
        }
        return null;
    }

    /* renamed from: ۟۠ۦۧۨ, reason: not valid java name and contains not printable characters */
    public static String m5961(Object obj) {
        if (C0050.m8121() < 0) {
            return ((Config) obj).h;
        }
        return null;
    }

    /* renamed from: ۟۠ۧۦ۠, reason: not valid java name and contains not printable characters */
    public static boolean m5962(Object obj) {
        if (C0031.m5628() >= 0) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading();
        }
        return false;
    }

    /* renamed from: ۟ۡ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static void m5963(Object obj, Object obj2, Object obj3) {
        if (C0045.m7538() <= 0) {
            ((com.github.catvod.spider.merge.a1.k) obj).d((C0295f) obj2, (C0295f) obj3);
        }
    }

    /* renamed from: ۣ۟ۡۤۨ, reason: not valid java name and contains not printable characters */
    public static C0246g m5964() {
        if (C0023.m4566() <= 0) {
            return AbstractC0236E.a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۧۤ, reason: not valid java name and contains not printable characters */
    public static String m5965() {
        if (C0010.m2320() < 0) {
            return "类型";
        }
        return null;
    }

    /* renamed from: ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c.d m5966(Object obj, Object obj2) {
        if (C0039.m6529() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c.d) obj).i((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۧۤۢ, reason: not valid java name and contains not printable characters */
    public static HashMap m5967(Object obj) {
        if (C0002.m1242() > 0) {
            return ((com.github.catvod.spider.merge.l0.c) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۡۨۥۨ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.P.D m5968(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.P.w) obj).l();
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۡۥ, reason: not valid java name and contains not printable characters */
    public static String m5969() {
        if (C0051.m8216() <= 0) {
            return "/proxy?do=seachdanmu&go=dianshisaoma')\n            .then(r => r.text())\n            .then(text => showStatus(text || '✅ 扫码请求已发送，请打开电视端扫码', 'success'))\n            .catch(() => showStatus('❌ 推送失败，请检查服务是否运行', 'failure'));\n    }\n\n    // 切换弹幕面板\n    toggleDanmuBtn.addEventListener('click', toggleDanmuPanel);\n\n    function toggleDanmuPanel() {\n        if (isPanelVisible) {\n            // 隐藏面板并从DOM中移除\n            if (danmuPanel && danmuPanel.parentNode) {\n                danmuPanel.parentNode.removeChild(danmuPanel);\n            }\n            danmuPanel = null;\n            toggleDanmuBtn.innerHTML = '<i class=\"fas fa-comment-dots\"></i> 发弹幕';\n        } else {\n            // 创建并显示面板\n            createDanmuPanel();\n            toggleDanmuBtn.innerHTML = '<i class=\"fas fa-eye-slash\"></i> 隐藏面板';\n        }\n        isPanelVisible = !isPanelVisible;\n    }\n\n    // 创建弹幕面板\n    function createDanmuPanel() {\n        // 创建面板容器\n        danmuPanel = document.createElement('div');\n        danmuPanel.id = 'danmuPanel';\n\n        // 设置面板内容\n        danmuPanel.innerHTML = `\n                <label for=\"danmuUsername\" style=\"display: inline-block; font-size: 13px; width: 100px;\">弹幕内容：</label>\n                <textarea id=\"danmuMessage\" placeholder=\"输入弹幕内容\" rows=\"2\" tabindex=\"0\"></textarea>\n                <div style=\"margin-bottom: 8px; font-size: 13px;\">\n                    <label for=\"danmuUsername\" style=\"display: inline-block; width: 50px;\">昵称：</label>\n                    <input type=\"text\" id=\"danmuUsername\" placeholder=\"输入昵称\" value=\"";
        }
        return null;
    }

    /* renamed from: ۟ۢۡۦۤ, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m5970() {
        if (C0054.m8557() < 0) {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        }
        return null;
    }

    /* renamed from: ۟ۢۤۥۢ, reason: not valid java name and contains not printable characters */
    public static int m5971(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.h.d) obj).b();
        }
        return 0;
    }

    /* renamed from: ۟ۢۥۣۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.I0.b m5972(Object obj, int i) {
        if (C0005.m1599() <= 0) {
            return ((com.github.catvod.spider.merge.E0.p) obj).c(i);
        }
        return null;
    }

    /* renamed from: ۟ۢۨ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m5973(Object obj) {
        if (m6048() < 0) {
            return ((XPath) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۢۨ۠ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5974(Object obj, Object obj2) {
        if (C0052.m8320() >= 0) {
            return ((ShortcutManager) obj).updateShortcuts((List) obj2);
        }
        return false;
    }

    /* renamed from: ۣۣ۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m5975(Object obj, int i) {
        if (C0048.m7971() >= 0) {
            ((ArrayAdapter) obj).setDropDownViewResource(i);
        }
    }

    /* renamed from: ۣ۟۠۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m5976() {
        if (C0000.m1116() <= 0) {
            return ".";
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static String m5977() {
        if (C0048.m7971() > 0) {
            return "[";
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۡ۠, reason: not valid java name and contains not printable characters */
    public static void m5978(Object obj) {
        if (C0050.m8121() <= 0) {
            Config.b((String) obj);
        }
    }

    /* renamed from: ۣ۟ۢۤۨ, reason: not valid java name and contains not printable characters */
    public static Object[] m5979() {
        if (C0030.m5375() > 0) {
            return C0273c.f;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۡۦ, reason: not valid java name and contains not printable characters */
    public static Map m5980(Object obj, Object obj2) {
        if (C0035.m6140() < 0) {
            return Collections.singletonMap(obj, obj2);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤۨ, reason: not valid java name and contains not printable characters */
    public static String m5981(Object obj) {
        if (C0004.m1557() <= 0) {
            return MYzhiqiu.d((JSONObject) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۥۨ, reason: not valid java name and contains not printable characters */
    public static HashMap m5982() {
        if (C0043.m7332() > 0) {
            return HBmengya.a();
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۢۤ, reason: not valid java name and contains not printable characters */
    public static boolean m5983(Object obj, Object obj2) {
        if (C0011.m2755() >= 0) {
            return C0164v.c((C0164v) obj, (AbstractC0152i) obj2);
        }
        return false;
    }

    /* renamed from: ۣ۟ۨۦۦ, reason: not valid java name and contains not printable characters */
    public static int m5984(Object obj) {
        if (C0061.m9359() < 0) {
            return ((RunnableC0235D) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۤۡۦۦ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.p000mergexbpq.c0.o m5985(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((com.github.catvod.spider.p000mergexbpq.c0.o) obj).s0();
        }
        return null;
    }

    /* renamed from: ۟ۤۢۧ۟, reason: not valid java name and contains not printable characters */
    public static String m5986(Object obj) {
        if (C0050.m8121() < 0) {
            return ((URLConnection) obj).getContentEncoding();
        }
        return null;
    }

    /* renamed from: ۟ۤۥۣۤ, reason: not valid java name and contains not printable characters */
    public static String m5987() {
        if (C0005.m1599() < 0) {
            return "四次跳转播放链接";
        }
        return null;
    }

    /* renamed from: ۟ۤۥۥۦ, reason: not valid java name and contains not printable characters */
    public static int m5988() {
        if (C0054.m8557() < 0) {
            return com.github.catvod.spider.p000mergexbpq.U.h.a;
        }
        return 0;
    }

    /* renamed from: ۟ۤۥۧۢ, reason: not valid java name and contains not printable characters */
    public static Charset m5989() {
        if (C0049.m8038() < 0) {
            return C0012.m3001();
        }
        return null;
    }

    /* renamed from: ۟ۤۧۤ۟, reason: not valid java name and contains not printable characters */
    public static char m5990(Object obj, int i) {
        if (C0009.m2047() >= 0) {
            return ((C0163u) obj).c(i);
        }
        return (char) 0;
    }

    /* renamed from: ۟ۥ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static int m5991(Object obj, Object obj2) {
        if (C0015.m3433() >= 0) {
            return ((com.github.catvod.spider.merge.T0.c) obj).g((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۟ۥ۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m5992() {
        if (C0061.m9359() <= 0) {
            com.github.catvod.spider.merge.g0.f.a();
        }
    }

    /* renamed from: ۟ۥۡۢۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m5993(Object obj) {
        if (C0031.m5628() > 0) {
            return AppYsV2.e((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۥۤ, reason: not valid java name and contains not printable characters */
    public static void m5994(Object obj, Object obj2) {
        if (C0043.m7332() >= 0) {
            com.github.catvod.spider.merge.D.f.q((String) obj, (String) obj2);
        }
    }

    /* renamed from: ۟ۥۣۤۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m5995(Object obj) {
        if (C0015.m3433() >= 0) {
            return ((C0233B) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥۤۦ۠, reason: not valid java name and contains not printable characters */
    public static int m5996(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((C0173e) obj).b;
        }
        return 0;
    }

    /* renamed from: ۟ۥۤۨۢ, reason: not valid java name and contains not printable characters */
    public static byte[] m5997(Object obj, int i) {
        if (C0000.m1116() < 0) {
            return Base64.decode((String) obj, i);
        }
        return null;
    }

    /* renamed from: ۟ۥۧۧۡ, reason: not valid java name and contains not printable characters */
    public static String m5998() {
        if (C0043.m7332() > 0) {
            return "/proxy?do=seachdanmu&go=dianshisaoma`;\n    \n    // 使用fetch发送GET请求\n    fetch(url)\n        .then(response => {\n            if (!response.ok) {\n                throw new Error('网络响应不正常');\n            }\n            return response.text(); // 或 response.json() 如果返回的是JSON数据\n        })\n        .then(data => {\n            console.log('请求成功，返回数据：', data);\n            // 可以在这里添加请求成功后的处理逻辑\n        })\n        .catch(error => {\n            console.error('请求失败：', error);\n            // 可以在这里添加请求失败后的处理逻辑\n        });\n}\n// 获取所有剧集卡片\n        const episodeCards = document.querySelectorAll('.episode');\n        const responseMessage = document.getElementById('responseMessage');\n        \n        // 为每个剧集卡片中的a标签添加点击事件\n        document.querySelectorAll('.episode-link').forEach(link => {\n            link.addEventListener('click', function(e) {\n                e.preventDefault(); // 阻止a标签的默认跳转行为\n                // 触发父元素的点击事件\n                this.parentElement.click();\n            });\n        });\n\n// 处理剧集卡片交互的函数\nfunction handleEpisodeCardInteraction(e) {\n    // 如果点击的是a标签，不执行后续操作\n    if (e.target.tagName === 'A') return;\n    \n    // 对于键盘事件，只响应Enter键\n    if (e.type === 'keydown' && !(e.key === 'Enter' || e.keyCode === 13)) {\n        return;\n    }\n    \n    // 重置所有卡片状态\n    episodeCards.forEach(c => c.classList.remove('active', 'error'));\n    \n    // 设置当前卡片为活动状态\n    this.classList.add('active');\n    \n    // 获取请求URL\n    const url = this.getAttribute('data-url');\n    if (!url) {\n        responseMessage.textContent = '无效的请求地址';\n        responseMessage.className = 'response-message error';\n        responseMessage.style.display = 'block';\n        return;\n    }\n    \n    // 显示加载状态\n    responseMessage.textContent = '正在推送...';\n    responseMessage.className = 'response-message success';\n    responseMessage.style.display = 'block';\n    \n    // 创建FormData对象\n    const formData = new FormData();\n    formData.append('_background', '1');\n    \n    // 使用sendBeacon发送请求\n    const success = navigator.sendBeacon(url, formData);\n    \n    if (success) {\n        responseMessage.textContent = '弹幕已推送';\n        responseMessage.className = 'response-message success';\n        this.classList.add('active');\n        this.classList.remove('error');\n    } else {\n        // 添加发送失败的处理\n        responseMessage.textContent = '推送失败，请重试';\n        responseMessage.className = 'response-message error';\n        this.classList.remove('active');\n        this.classList.add('error');\n    }\n    \n    // 3秒后隐藏提示信息\n    setTimeout(() => {\n        responseMessage.style.display = 'none';\n    }, 3000);\n    \n    // 阻止键盘事件的默认行为\n    if (e.type === 'keydown') {\n        e.preventDefault();\n    }\n}\n\n// 为每个剧集卡片添加事件监听\nepisodeCards.forEach(card => {\n    card.addEventListener('click', handleEpisodeCardInteraction);\n    card.addEventListener('keydown', handleEpisodeCardInteraction);\n});\n        \n        // 新增的发送功能代码\n        const usernameInput = document.getElementById('username');\n        const messageInput = document.getElementById('message');\n        const sendButton = document.getElementById('sendBtn');\n        const inputContainer = document.getElementById('inputContainer');\n        const toggleInputBtn = document.getElementById('toggleInputBtn');\n        \n// 折叠/展开输入区域的处理函数\nfunction toggleInputArea() {\n    const collapsibleContent = document.querySelector('.collapsible-content');\n    const focusableElements = collapsibleContent.querySelectorAll('input, textarea, button');\n    if (inputContainer.classList.contains('collapsed')) {\n        // 展开\n        inputContainer.classList.remove('collapsed');\n        inputContainer.classList.add('expanded');\n        toggleInputBtn.textContent = '折叠发送弹幕';\n         focusableElements.forEach(el => { \n                        el.setAttribute('tabindex', '0');\n              });\n    } else {\n        // 折叠\n        inputContainer.classList.remove('expanded');\n        inputContainer.classList.add('collapsed');\n        toggleInputBtn.textContent = '点此发送弹幕';\n         focusableElements.forEach(el => { \n                        el.setAttribute('tabindex', '-1');\n              });\n    }\n}\n\n// 点击事件\ntoggleInputBtn.addEventListener('click', toggleInputArea);\n\n// 键盘事件 - 只响应Enter键\ntoggleInputBtn.addEventListener('keydown', function(e) {\n    // 只在按下Enter键时触发\n    if (e.key === 'Enter' || e.keyCode === 13) {\n        toggleInputArea();\n        // 阻止事件冒泡和默认行为\n        e.preventDefault();\n        e.stopPropagation();\n    }\n});\n\n// 发送按钮点击事件\nsendButton.addEventListener('click', sendData);\n\n// 键盘事件 - 限制为Enter键触发\nsendButton.addEventListener('keydown', function(e) {\n    // 只在按下Enter键时触发发送\n    if (e.key === 'Enter' || e.keyCode === 13) {\n        sendData();\n        // 阻止默认行为，避免表单提交等意外情况\n        e.preventDefault();\n    }\n});\n        \n        // 文本框回车事件\n        messageInput.addEventListener('keypress', function(e) {\n            if (e.key === 'Enter' && !e.shiftKey) {\n                e.preventDefault();\n                sendData();\n            }\n        });\n        \n        // 发送数据函数\n        function sendData() {\n            const username = usernameInput.value.trim();\n            const message = messageInput.value.trim();\n            \n            // 验证输入\n            if (!username) {\n                showMessage('请输入用户名', 'failure');\n                return;\n            }\n            \n            if (!message) {\n                showMessage('请输入要发送的内容', 'failure');\n                return;\n            }\n            \n            // 构建GET请求URL\n            const baseUrl = '";
        }
        return null;
    }

    /* renamed from: ۟ۥۧۨۥ, reason: not valid java name and contains not printable characters */
    public static String m5999() {
        if (C0002.m1242() > 0) {
            return "#http";
        }
        return null;
    }

    /* renamed from: ۟ۥۨۦۨ, reason: not valid java name and contains not printable characters */
    public static void m6000(Object obj, Object obj2) {
        if (C0027.m5017() > 0) {
            ((com.github.catvod.spider.merge.G.a) obj).n((String) obj2);
        }
    }

    /* renamed from: ۟ۦ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static Method m6002(Object obj, Object obj2) {
        if (C0006.m1726() < 0) {
            return ((com.github.catvod.spider.merge.C.a) obj).c((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۢۧۥ, reason: not valid java name and contains not printable characters */
    public static void m6003(Object obj) {
        if (C0029.m5282() >= 0) {
            com.github.catvod.spider.p000mergexbpq.b.p.d((com.github.catvod.spider.p000mergexbpq.b.p) obj);
        }
    }

    /* renamed from: ۟ۦۣۥۡ, reason: not valid java name and contains not printable characters */
    public static C0259u m6004() {
        if (C0007.m1886() > 0) {
            return AbstractC0258t.a;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۤۤ, reason: not valid java name and contains not printable characters */
    public static void m6005(Object obj, Object obj2, Object obj3) {
        if (C0051.m8216() <= 0) {
            ((com.github.catvod.spider.merge.E0.h) obj).f((com.github.catvod.spider.merge.E0.o) obj2, (com.github.catvod.spider.merge.E0.q) obj3);
        }
    }

    /* renamed from: ۟ۦۦۣۧ, reason: not valid java name and contains not printable characters */
    public static void m6006(Object obj) {
        if (C0014.m3353() < 0) {
            ((Thread) obj).interrupt();
        }
    }

    /* renamed from: ۟ۦۣۧۢ, reason: not valid java name and contains not printable characters */
    public static String m6007(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((C0254o) obj).j;
        }
        return null;
    }

    /* renamed from: ۟ۧ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static Resources m6008(Object obj) {
        if (C0055.m8740() > 0) {
            return ((View) obj).getResources();
        }
        return null;
    }

    /* renamed from: ۟ۧۤۦۡ, reason: not valid java name and contains not printable characters */
    public static int m6009(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((View) obj).getTop();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۧۧۡ, reason: not valid java name and contains not printable characters */
    public static int m6010(Object obj) {
        return obj.hashCode();
    }

    /* renamed from: ۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static int m6011(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((Drawable) obj).getLevel();
        }
        return 0;
    }

    /* renamed from: ۠ۢۢۥ, reason: not valid java name and contains not printable characters */
    public static boolean m6012(Object obj, Object obj2) {
        if (m6048() < 0) {
            return ((ArrayList) obj).addAll((Collection) obj2);
        }
        return false;
    }

    /* renamed from: ۠ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static String m6013(Object obj) {
        if (C0015.m3433() > 0) {
            return Symx.d((String) obj);
        }
        return null;
    }

    /* renamed from: ۡ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.g1.b m6014() {
        if (C0054.m8557() <= 0) {
            return com.github.catvod.spider.merge.g1.b.a;
        }
        return null;
    }

    /* renamed from: ۡۦۨۤ, reason: not valid java name and contains not printable characters */
    public static String m6015() {
        if (C0003.m1463() < 0) {
            return "&&";
        }
        return null;
    }

    /* renamed from: ۢ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static void m6016(Object obj, boolean z) {
        if (C0042.m7147() < 0) {
            ((Config) obj).setBusy(z);
        }
    }

    /* renamed from: ۣۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static HashMap m6017() {
        if (C0005.m1599() < 0) {
            return com.github.catvod.spider.p000mergexbpq.k.g.d;
        }
        return null;
    }

    /* renamed from: ۢۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m6018(Object obj) {
        if (C0040.m6582() >= 0) {
            return com.github.catvod.spider.merge.B0.a.b((C0148e) obj);
        }
        return null;
    }

    /* renamed from: ۢۡۢۥ, reason: not valid java name and contains not printable characters */
    public static Object m6019(Object obj, int i) {
        if (C0014.m3353() < 0) {
            return ((LinkedList) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۢۡۥۧ, reason: not valid java name and contains not printable characters */
    public static Pattern m6020(Object obj) {
        if (C0002.m1242() > 0) {
            return ((Ddrk) obj).i;
        }
        return null;
    }

    /* renamed from: ۢۤۤ۠, reason: not valid java name and contains not printable characters */
    public static C0288g m6021(Object obj) {
        if (C0013.m3167() > 0) {
            return ((ViewOnFocusChangeListenerC0284c) obj).b;
        }
        return null;
    }

    /* renamed from: ۢۦۦۡ, reason: not valid java name and contains not printable characters */
    public static int m6022(Object obj, Object obj2, Object obj3) {
        if (C0005.m1599() < 0) {
            return ((L) obj).m((C0148e) obj2, (com.github.catvod.spider.merge.E0.p) obj3);
        }
        return 0;
    }

    /* renamed from: ۢۦۧۧ, reason: not valid java name and contains not printable characters */
    public static String m6023() {
        if (C0051.m8216() < 0) {
            return com.github.catvod.spider.merge.Z0.j.a();
        }
        return null;
    }

    /* renamed from: ۢۧۡۨ, reason: not valid java name and contains not printable characters */
    public static boolean m6024(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((C0254o) obj).n;
        }
        return false;
    }

    /* renamed from: ۢۧۢۡ, reason: not valid java name and contains not printable characters */
    public static int m6025(Object obj) {
        if (C0003.m1463() < 0) {
            return ((InterfaceC0370c) obj).v();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static Matcher m6026(Object obj, Object obj2) {
        if (C0049.m8038() < 0) {
            return ((Pattern) obj).matcher((CharSequence) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣۡۦ, reason: not valid java name and contains not printable characters */
    public static Appendable m6027(Object obj, Object obj2) {
        if (C0051.m8216() <= 0) {
            return ((StringBuilder) obj).append((CharSequence) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣۥۣ, reason: not valid java name and contains not printable characters */
    public static Locale m6028(Object obj) {
        if (C0054.m8557() < 0) {
            return ((com.github.catvod.spider.merge.P0.x) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۥۡ۟, reason: not valid java name and contains not printable characters */
    public static Pattern m6029() {
        if (C0006.m1726() <= 0) {
            return com.github.catvod.spider.merge.l0.b.f;
        }
        return null;
    }

    /* renamed from: ۣۦۤۧ, reason: not valid java name and contains not printable characters */
    public static String m6030() {
        if (C0020.m4210() < 0) {
            return "语言";
        }
        return null;
    }

    /* renamed from: ۣۧۥۦ, reason: not valid java name and contains not printable characters */
    public static int m6031(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((XmlResourceParser) obj).next();
        }
        return 0;
    }

    /* renamed from: ۣۤ۠۠, reason: not valid java name and contains not printable characters */
    public static String m6032() {
        if (C0038.m6471() >= 0) {
            return "KEY";
        }
        return null;
    }

    /* renamed from: ۤۤ۠۠, reason: not valid java name and contains not printable characters */
    public static String m6033(Object obj) {
        if (C0003.m1463() < 0) {
            return ((com.github.catvod.spider.merge.D.f) obj).a;
        }
        return null;
    }

    /* renamed from: ۤۥ۠۟, reason: not valid java name and contains not printable characters */
    public static int m6034(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((com.github.catvod.spider.merge.G0.b) obj).c;
        }
        return 0;
    }

    /* renamed from: ۥۥۡۢ, reason: contains not printable characters */
    public static String m6035() {
        if (C0026.m4977() <= 0) {
            return "Jb";
        }
        return null;
    }

    /* renamed from: ۥۨۥۨ, reason: contains not printable characters */
    public static int m6036(Object obj, Object obj2) {
        if (C0010.m2320() < 0) {
            return ((JSONObject) obj).optInt((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۦ۠ۨ۠, reason: contains not printable characters */
    public static boolean m6037(Object obj, Object obj2) {
        if (C0032.m5686() <= 0) {
            return ((PackageManager) obj).hasSystemFeature((String) obj2);
        }
        return false;
    }

    /* renamed from: ۦۣۤۨ, reason: contains not printable characters */
    public static boolean m6038(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((Enumeration) obj).hasMoreElements();
        }
        return false;
    }

    /* renamed from: ۦۦۧۧ, reason: contains not printable characters */
    public static float m6039(Object obj, int i) {
        if (C0036.m6252() >= 0) {
            return ((GnssStatus) obj).getCn0DbHz(i);
        }
        return 0.0f;
    }

    /* renamed from: ۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static w m6040(Object obj) {
        if (C0014.m3353() < 0) {
            return w.e((Activity) obj);
        }
        return null;
    }

    /* renamed from: ۧۢۤۧ, reason: not valid java name and contains not printable characters */
    public static void m6041(Object obj, int i) {
        if (C0040.m6582() >= 0) {
            ((ProgressBar) obj).setMax(i);
        }
    }

    /* renamed from: ۣۧۡ۟, reason: not valid java name and contains not printable characters */
    public static boolean m6042(Object obj, Object obj2) {
        if (C0055.m8740() > 0) {
            return ((Boolean) obj).equals(obj2);
        }
        return false;
    }

    /* renamed from: ۧۦۣۧ, reason: not valid java name and contains not printable characters */
    public static Pattern m6043(Object obj) {
        if (C0026.m4977() < 0) {
            return ((Wogg) obj).i;
        }
        return null;
    }

    /* renamed from: ۧۦۤۨ, reason: not valid java name and contains not printable characters */
    public static View m6044(Object obj, int i) {
        if (C0031.m5628() >= 0) {
            return ((View) obj).findViewById(i);
        }
        return null;
    }

    /* renamed from: ۣۧۨ۟, reason: not valid java name and contains not printable characters */
    public static com.github.catvod.spider.merge.l0.i[] m6045() {
        if (C0002.m1242() >= 0) {
            return com.github.catvod.spider.merge.l0.i.values();
        }
        return null;
    }

    /* renamed from: ۨ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m6046(Object obj) {
        if (C0035.m6140() < 0) {
            return Supjav.b((String) obj);
        }
        return null;
    }

    /* renamed from: ۨۡۢۦ, reason: not valid java name and contains not printable characters */
    public static void m6047(Object obj, Object obj2, int i, int i2) throws IOException {
        if (C0040.m6582() >= 0) {
            ((FileOutputStream) obj).write((byte[]) obj2, i, i2);
        }
    }

    /* renamed from: ۣۨ۟۟, reason: not valid java name and contains not printable characters */
    public static int m6048() {
        return (-601) ^ C0050.f771;
    }

    /* renamed from: ۨۥۣ۠, reason: not valid java name and contains not printable characters */
    public static void m6049(Object obj) {
        if (C0022.m4497() > 0) {
            ((com.github.catvod.spider.merge.E.g) obj).b();
        }
    }

    /* renamed from: ۨۨۧۧ, reason: not valid java name and contains not printable characters */
    public static void m6050(Object obj, Object obj2) throws IOException {
        if (C0015.m3433() >= 0) {
            ((DataOutputStream) obj).writeBytes((String) obj2);
        }
    }

    /* renamed from: ۟ۦ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m6001(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}