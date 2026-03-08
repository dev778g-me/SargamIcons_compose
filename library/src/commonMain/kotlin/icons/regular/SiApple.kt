package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiApple: ImageVector
    get() {
        if (_SiApple != null) {
            return _SiApple!!
        }
        _SiApple = ImageVector.Builder(
            name = "Regular.SiApple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.764f, 8.819f)
                curveToRelative(-0.116f, 0.09f, -2.165f, 1.244f, -2.165f, 3.81f)
                curveToRelative(0f, 2.968f, 2.607f, 4.019f, 2.685f, 4.045f)
                curveToRelative(-0.012f, 0.064f, -0.414f, 1.438f, -1.374f, 2.838f)
                curveToRelative(-0.857f, 1.232f, -1.75f, 2.462f, -3.11f, 2.462f)
                curveToRelative(-1.361f, 0f, -1.711f, -0.79f, -3.281f, -0.79f)
                curveToRelative(-1.53f, 0f, -2.074f, 0.816f, -3.318f, 0.816f)
                reflectiveCurveToRelative(-2.113f, -1.14f, -3.11f, -2.54f)
                curveTo(4.933f, 17.816f, 4f, 15.26f, 4f, 12.837f)
                curveToRelative(0f, -3.888f, 2.528f, -5.95f, 5.017f, -5.95f)
                curveToRelative(1.322f, 0f, 2.424f, 0.868f, 3.254f, 0.868f)
                curveToRelative(0.79f, 0f, 2.022f, -0.92f, 3.526f, -0.92f)
                curveToRelative(0.57f, 0f, 2.618f, 0.051f, 3.967f, 1.984f)
                close()
                moveTo(15.084f, 5.189f)
                curveToRelative(0.621f, -0.739f, 1.061f, -1.763f, 1.061f, -2.787f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.107f, 2f)
                curveToRelative(-1.012f, 0.038f, -2.216f, 0.674f, -2.942f, 1.516f)
                curveToRelative(-0.57f, 0.648f, -1.102f, 1.672f, -1.102f, 2.71f)
                curveToRelative(0f, 0.156f, 0.026f, 0.312f, 0.038f, 0.362f)
                curveToRelative(0.064f, 0.012f, 0.168f, 0.026f, 0.272f, 0.026f)
                curveToRelative(0.908f, 0f, 2.05f, -0.608f, 2.71f, -1.426f)
                close()
            }
        }.build()

        return _SiApple!!
    }

@Suppress("ObjectPropertyName")
private var _SiApple: ImageVector? = null
