package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiSettingsAlt: ImageVector
    get() {
        if (_SiSettingsAlt != null) {
            return _SiSettingsAlt!!
        }
        _SiSettingsAlt = ImageVector.Builder(
            name = "Filled.SiSettingsAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.4f, 1f)
                curveToRelative(0.88f, 0f, 1.6f, 0.72f, 1.6f, 1.6f)
                verticalLineToRelative(2.69f)
                curveToRelative(0.47f, 0.14f, 0.91f, 0.32f, 1.33f, 0.55f)
                lineToRelative(1.9f, -1.9f)
                curveToRelative(0.62f, -0.62f, 1.64f, -0.62f, 2.26f, 0f)
                lineToRelative(0.57f, 0.57f)
                curveToRelative(0.62f, 0.62f, 0.62f, 1.64f, 0f, 2.26f)
                lineToRelative(-1.9f, 1.9f)
                curveToRelative(0.23f, 0.42f, 0.41f, 0.86f, 0.55f, 1.33f)
                horizontalLineToRelative(2.69f)
                curveToRelative(0.88f, 0f, 1.6f, 0.72f, 1.6f, 1.6f)
                verticalLineToRelative(0.8f)
                curveToRelative(0f, 0.88f, -0.72f, 1.6f, -1.6f, 1.6f)
                horizontalLineToRelative(-2.69f)
                curveToRelative(-0.14f, 0.47f, -0.32f, 0.91f, -0.55f, 1.33f)
                lineToRelative(1.9f, 1.9f)
                curveToRelative(0.62f, 0.62f, 0.62f, 1.64f, 0f, 2.26f)
                lineToRelative(-0.57f, 0.57f)
                curveToRelative(-0.62f, 0.62f, -1.64f, 0.62f, -2.26f, 0f)
                lineToRelative(-1.9f, -1.9f)
                curveToRelative(-0.42f, 0.23f, -0.86f, 0.41f, -1.33f, 0.55f)
                verticalLineToRelative(2.69f)
                curveToRelative(0f, 0.88f, -0.72f, 1.6f, -1.6f, 1.6f)
                horizontalLineToRelative(-0.8f)
                curveToRelative(-0.88f, 0f, -1.6f, -0.72f, -1.6f, -1.6f)
                verticalLineToRelative(-2.69f)
                arcToRelative(6.8f, 6.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.33f, -0.55f)
                lineToRelative(-1.9f, 1.9f)
                curveToRelative(-0.62f, 0.62f, -1.64f, 0.62f, -2.26f, 0f)
                lineToRelative(-0.57f, -0.57f)
                curveToRelative(-0.62f, -0.62f, -0.62f, -1.64f, 0f, -2.26f)
                lineToRelative(1.9f, -1.9f)
                arcTo(6.8f, 6.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.29f, 14f)
                horizontalLineTo(2.6f)
                curveToRelative(-0.88f, 0f, -1.6f, -0.72f, -1.6f, -1.6f)
                verticalLineToRelative(-0.8f)
                curveToRelative(0f, -0.88f, 0.72f, -1.6f, 1.6f, -1.6f)
                horizontalLineToRelative(2.69f)
                curveToRelative(0.14f, -0.47f, 0.32f, -0.91f, 0.55f, -1.33f)
                lineToRelative(-1.9f, -1.9f)
                curveToRelative(-0.62f, -0.62f, -0.62f, -1.64f, 0f, -2.26f)
                lineToRelative(0.57f, -0.57f)
                curveToRelative(0.62f, -0.62f, 1.64f, -0.62f, 2.26f, 0f)
                lineToRelative(1.9f, 1.9f)
                curveToRelative(0.42f, -0.23f, 0.86f, -0.41f, 1.33f, -0.55f)
                verticalLineTo(2.6f)
                curveToRelative(0f, -0.88f, 0.72f, -1.6f, 1.6f, -1.6f)
                close()
                moveTo(12f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -8f)
            }
        }.build()

        return _SiSettingsAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiSettingsAlt: ImageVector? = null
