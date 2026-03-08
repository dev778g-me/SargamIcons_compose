package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiTrafficCone: ImageVector
    get() {
        if (_SiTrafficCone != null) {
            return _SiTrafficCone!!
        }
        _SiTrafficCone = ImageVector.Builder(
            name = "Filled.SiTrafficCone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 20f)
                horizontalLineToRelative(-3.278f)
                lineToRelative(-1.014f, -3.646f)
                quadToRelative(-0.122f, 0.066f, -0.265f, 0.095f)
                curveTo(15.685f, 16.813f, 13.867f, 17f, 12f, 17f)
                curveToRelative(-1.868f, 0f, -3.767f, -0.197f, -5.564f, -0.571f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.153f, -0.045f)
                lineTo(5.278f, 20f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                moveTo(6.817f, 14.466f)
                lineToRelative(0.027f, 0.005f)
                curveTo(8.507f, 14.817f, 10.268f, 15f, 12f, 15f)
                curveToRelative(1.733f, 0f, 3.415f, -0.173f, 5.037f, -0.51f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.148f, -0.019f)
                lineToRelative(-1.087f, -3.911f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.275f, 0.093f)
                arcTo(21f, 21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11f)
                arcToRelative(21.4f, 21.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.108f, -0.404f)
                close()
                moveTo(8.43f, 8.665f)
                arcTo(19.3f, 19.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                curveToRelative(1.181f, 0f, 2.34f, -0.105f, 3.457f, -0.313f)
                quadToRelative(0.058f, -0.01f, 0.116f, -0.015f)
                lineTo(14.16f, 3.59f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.77f, -0.59f)
                horizontalLineToRelative(-2.78f)
                curveToRelative(-0.36f, 0f, -0.67f, 0.24f, -0.77f, 0.59f)
                close()
            }
        }.build()

        return _SiTrafficCone!!
    }

@Suppress("ObjectPropertyName")
private var _SiTrafficCone: ImageVector? = null
