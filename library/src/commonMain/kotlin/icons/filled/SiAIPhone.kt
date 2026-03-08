package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAIPhone: ImageVector
    get() {
        if (_SiAIPhone != null) {
            return _SiAIPhone!!
        }
        _SiAIPhone = ImageVector.Builder(
            name = "Filled.SiAIPhone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.915f, 4.265f)
                curveToRelative(0.35f, -1.021f, 1.82f, -1.02f, 2.17f, 0f)
                lineToRelative(0.03f, 0.105f)
                lineToRelative(0.302f, 1.21f)
                lineToRelative(1.213f, 0.304f)
                curveToRelative(1.161f, 0.29f, 1.161f, 1.94f, 0f, 2.231f)
                lineToRelative(-1.212f, 0.303f)
                lineToRelative(-0.302f, 1.212f)
                curveToRelative(-0.291f, 1.161f, -1.941f, 1.161f, -2.232f, 0f)
                lineToRelative(-0.304f, -1.213f)
                lineToRelative(-1.21f, -0.302f)
                curveToRelative(-1.161f, -0.29f, -1.161f, -1.94f, 0f, -2.231f)
                lineToRelative(1.211f, -0.303f)
                lineToRelative(0.303f, -1.21f)
                close()
                moveTo(16.985f, 6.149f)
                arcToRelative(1.15f, 1.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.836f, 0.837f)
                lineToRelative(-0.057f, 0.013f)
                lineToRelative(0.057f, 0.015f)
                curveToRelative(0.412f, 0.103f, 0.733f, 0.425f, 0.837f, 0.837f)
                lineToRelative(0.013f, 0.056f)
                lineToRelative(0.015f, -0.056f)
                arcToRelative(1.15f, 1.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.837f, -0.837f)
                lineToRelative(0.056f, -0.015f)
                lineToRelative(-0.056f, -0.013f)
                arcToRelative(1.15f, 1.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.837f, -0.837f)
                lineToRelative(-0.015f, -0.057f)
                close()
                moveTo(7.18f, 10.27f)
                lineToRelative(6.504f, 6.46f)
                curveToRelative(0.697f, -0.807f, 5.11f, -5.538f, 7.316f, 0.924f)
                curveToRelative(0f, 0f, -0.232f, 3.346f, -4.994f, 3.346f)
                curveToRelative(-3.367f, 0f, -6.851f, -4.038f, -9.29f, -6.346f)
                curveTo(4.626f, 12.692f, 3f, 10.154f, 3f, 7.846f)
                curveTo(3f, 3.116f, 6.252f, 3f, 6.252f, 3f)
                curveToRelative(7.432f, 2.538f, 0.929f, 7.27f, 0.929f, 7.27f)
            }
        }.build()

        return _SiAIPhone!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIPhone: ImageVector? = null
