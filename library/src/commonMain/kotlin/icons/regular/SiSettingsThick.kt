package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiSettingsThick: ImageVector
    get() {
        if (_SiSettingsThick != null) {
            return _SiSettingsThick!!
        }
        _SiSettingsThick = ImageVector.Builder(
            name = "Regular.SiSettingsThick",
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
                moveTo(20.38f, 9.49f)
                horizontalLineToRelative(-1.87f)
                curveToRelative(-0.05f, -0.12f, -0.09f, -0.24f, -0.14f, -0.35f)
                lineToRelative(1.32f, -1.32f)
                curveToRelative(0.62f, -0.62f, 0.62f, -1.64f, 0f, -2.26f)
                lineToRelative(-1.27f, -1.27f)
                curveToRelative(-0.62f, -0.62f, -1.64f, -0.62f, -2.26f, 0f)
                lineToRelative(-1.32f, 1.32f)
                curveToRelative(-0.12f, -0.05f, -0.23f, -0.1f, -0.35f, -0.14f)
                verticalLineTo(3.6f)
                curveToRelative(0f, -0.88f, -0.72f, -1.6f, -1.6f, -1.6f)
                horizontalLineToRelative(-1.8f)
                curveToRelative(-0.88f, 0f, -1.6f, 0.72f, -1.6f, 1.6f)
                verticalLineToRelative(1.87f)
                curveToRelative(-0.12f, 0.05f, -0.24f, 0.09f, -0.35f, 0.14f)
                lineTo(7.82f, 4.29f)
                curveToRelative(-0.62f, -0.62f, -1.64f, -0.62f, -2.26f, 0f)
                lineTo(4.29f, 5.56f)
                curveToRelative(-0.62f, 0.62f, -0.62f, 1.64f, 0f, 2.26f)
                lineToRelative(1.32f, 1.32f)
                curveToRelative(-0.05f, 0.12f, -0.1f, 0.23f, -0.14f, 0.35f)
                horizontalLineTo(3.6f)
                curveToRelative(-0.88f, 0f, -1.6f, 0.72f, -1.6f, 1.6f)
                verticalLineToRelative(1.8f)
                curveToRelative(0f, 0.88f, 0.72f, 1.6f, 1.6f, 1.6f)
                horizontalLineToRelative(1.87f)
                curveToRelative(0.05f, 0.12f, 0.09f, 0.24f, 0.14f, 0.35f)
                lineToRelative(-1.32f, 1.32f)
                curveToRelative(-0.62f, 0.62f, -0.62f, 1.64f, 0f, 2.26f)
                lineToRelative(1.27f, 1.27f)
                curveToRelative(0.62f, 0.62f, 1.64f, 0.62f, 2.26f, 0f)
                lineToRelative(1.32f, -1.32f)
                curveToRelative(0.12f, 0.05f, 0.23f, 0.1f, 0.35f, 0.14f)
                verticalLineToRelative(1.87f)
                curveToRelative(0f, 0.88f, 0.72f, 1.6f, 1.6f, 1.6f)
                horizontalLineToRelative(1.8f)
                curveToRelative(0.88f, 0f, 1.6f, -0.72f, 1.6f, -1.6f)
                verticalLineToRelative(-1.87f)
                curveToRelative(0.12f, -0.05f, 0.24f, -0.09f, 0.35f, -0.14f)
                lineToRelative(1.32f, 1.32f)
                curveToRelative(0.62f, 0.62f, 1.64f, 0.62f, 2.26f, 0f)
                lineToRelative(1.27f, -1.27f)
                curveToRelative(0.62f, -0.62f, 0.62f, -1.64f, 0f, -2.26f)
                lineToRelative(-1.32f, -1.32f)
                curveToRelative(0.05f, -0.12f, 0.1f, -0.23f, 0.14f, -0.35f)
                horizontalLineToRelative(1.87f)
                curveToRelative(0.88f, 0f, 1.6f, -0.72f, 1.6f, -1.6f)
                verticalLineToRelative(-1.8f)
                curveToRelative(0f, -0.88f, -0.72f, -1.6f, -1.6f, -1.6f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                close()
            }
        }.build()

        return _SiSettingsThick!!
    }

@Suppress("ObjectPropertyName")
private var _SiSettingsThick: ImageVector? = null
