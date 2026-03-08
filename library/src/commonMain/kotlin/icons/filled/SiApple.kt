package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiApple: ImageVector
    get() {
        if (_SiApple != null) {
            return _SiApple!!
        }
        _SiApple = ImageVector.Builder(
            name = "Filled.SiApple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.145f, 2.402f)
                curveToRelative(0f, 1.024f, -0.44f, 2.048f, -1.062f, 2.786f)
                curveToRelative(-0.66f, 0.818f, -1.802f, 1.426f, -2.71f, 1.426f)
                curveToRelative(-0.104f, 0f, -0.208f, -0.014f, -0.272f, -0.026f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.038f, -0.362f)
                curveToRelative(0f, -1.038f, 0.532f, -2.062f, 1.102f, -2.71f)
                curveToRelative(0.726f, -0.842f, 1.93f, -1.478f, 2.942f, -1.516f)
                curveToRelative(0.026f, 0.116f, 0.038f, 0.26f, 0.038f, 0.402f)
                moveTo(19.714f, 8.852f)
                lineToRelative(0.05f, -0.033f)
                curveToRelative(-1.349f, -1.933f, -3.397f, -1.985f, -3.967f, -1.985f)
                curveToRelative(-0.872f, 0f, -1.653f, 0.31f, -2.309f, 0.57f)
                curveToRelative(-0.475f, 0.188f, -0.885f, 0.35f, -1.217f, 0.35f)
                curveToRelative(-0.367f, 0f, -0.787f, -0.17f, -1.256f, -0.358f)
                curveToRelative(-0.592f, -0.24f, -1.26f, -0.51f, -1.998f, -0.51f)
                curveTo(6.528f, 6.886f, 4f, 8.95f, 4f, 12.837f)
                curveToRelative(0f, 2.424f, 0.934f, 4.979f, 2.09f, 6.623f)
                curveTo(7.088f, 20.86f, 7.956f, 22f, 9.2f, 22f)
                curveToRelative(0.59f, 0f, 1.023f, -0.183f, 1.478f, -0.376f)
                curveToRelative(0.504f, -0.214f, 1.036f, -0.44f, 1.84f, -0.44f)
                curveToRelative(0.814f, 0f, 1.3f, 0.212f, 1.768f, 0.416f)
                curveToRelative(0.437f, 0.19f, 0.857f, 0.374f, 1.513f, 0.374f)
                curveToRelative(1.36f, 0f, 2.254f, -1.23f, 3.11f, -2.462f)
                curveToRelative(0.96f, -1.4f, 1.363f, -2.774f, 1.375f, -2.838f)
                curveToRelative(-0.078f, -0.026f, -2.685f, -1.077f, -2.685f, -4.045f)
                curveToRelative(0f, -2.39f, 1.777f, -3.555f, 2.115f, -3.777f)
            }
        }.build()

        return _SiApple!!
    }

@Suppress("ObjectPropertyName")
private var _SiApple: ImageVector? = null
