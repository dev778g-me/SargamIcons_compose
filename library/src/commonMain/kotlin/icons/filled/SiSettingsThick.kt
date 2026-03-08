package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiSettingsThick: ImageVector
    get() {
        if (_SiSettingsThick != null) {
            return _SiSettingsThick!!
        }
        _SiSettingsThick = ImageVector.Builder(
            name = "Filled.SiSettingsThick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.89f, 2f)
                curveToRelative(0.88f, 0f, 1.6f, 0.72f, 1.6f, 1.6f)
                verticalLineToRelative(1.87f)
                curveToRelative(0.093f, 0.03f, 0.18f, 0.067f, 0.269f, 0.105f)
                lineToRelative(0.08f, 0.035f)
                lineToRelative(1.321f, -1.32f)
                curveToRelative(0.62f, -0.62f, 1.64f, -0.62f, 2.26f, 0f)
                lineToRelative(1.27f, 1.27f)
                curveToRelative(0.62f, 0.62f, 0.62f, 1.64f, 0f, 2.26f)
                lineToRelative(-1.32f, 1.32f)
                quadToRelative(0.044f, 0.096f, 0.081f, 0.2f)
                quadToRelative(0.029f, 0.075f, 0.059f, 0.15f)
                horizontalLineToRelative(1.87f)
                curveToRelative(0.88f, 0f, 1.6f, 0.72f, 1.6f, 1.6f)
                verticalLineToRelative(1.8f)
                curveToRelative(0f, 0.88f, -0.72f, 1.6f, -1.6f, 1.6f)
                horizontalLineToRelative(-1.87f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.14f, 0.35f)
                lineToRelative(1.32f, 1.32f)
                curveToRelative(0.62f, 0.62f, 0.62f, 1.64f, 0f, 2.26f)
                lineToRelative(-1.27f, 1.27f)
                curveToRelative(-0.62f, 0.62f, -1.64f, 0.62f, -2.26f, 0f)
                lineToRelative(-1.32f, -1.32f)
                quadToRelative(-0.096f, 0.044f, -0.2f, 0.081f)
                quadToRelative(-0.074f, 0.029f, -0.15f, 0.059f)
                verticalLineToRelative(1.87f)
                curveToRelative(0f, 0.88f, -0.72f, 1.6f, -1.6f, 1.6f)
                horizontalLineToRelative(-1.8f)
                curveToRelative(-0.88f, 0f, -1.6f, -0.72f, -1.6f, -1.6f)
                verticalLineToRelative(-1.87f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.268f, -0.106f)
                lineToRelative(-0.082f, -0.034f)
                lineToRelative(-1.32f, 1.32f)
                curveToRelative(-0.62f, 0.62f, -1.64f, 0.62f, -2.26f, 0f)
                lineToRelative(-1.27f, -1.27f)
                curveToRelative(-0.62f, -0.62f, -0.62f, -1.64f, 0f, -2.26f)
                lineToRelative(1.32f, -1.32f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.08f, -0.2f)
                lineToRelative(-0.06f, -0.15f)
                horizontalLineTo(3.6f)
                curveToRelative(-0.88f, 0f, -1.6f, -0.72f, -1.6f, -1.6f)
                verticalLineToRelative(-1.8f)
                curveToRelative(0f, -0.88f, 0.72f, -1.6f, 1.6f, -1.6f)
                horizontalLineToRelative(1.87f)
                quadToRelative(0.047f, -0.136f, 0.105f, -0.268f)
                lineToRelative(0.035f, -0.082f)
                lineToRelative(-1.32f, -1.32f)
                curveToRelative(-0.62f, -0.62f, -0.62f, -1.64f, 0f, -2.26f)
                lineToRelative(1.27f, -1.27f)
                curveToRelative(0.62f, -0.62f, 1.64f, -0.62f, 2.26f, 0f)
                lineToRelative(1.32f, 1.32f)
                quadToRelative(0.096f, -0.043f, 0.2f, -0.08f)
                lineToRelative(0.15f, -0.06f)
                verticalLineTo(3.6f)
                curveToRelative(0f, -0.88f, 0.72f, -1.6f, 1.6f, -1.6f)
                close()
                moveTo(12f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -8f)
            }
        }.build()

        return _SiSettingsThick!!
    }

@Suppress("ObjectPropertyName")
private var _SiSettingsThick: ImageVector? = null
