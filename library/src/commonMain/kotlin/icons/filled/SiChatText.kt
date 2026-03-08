package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiChatText: ImageVector
    get() {
        if (_SiChatText != null) {
            return _SiChatText!!
        }
        _SiChatText = ImageVector.Builder(
            name = "Filled.SiChatText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.475f, 16f)
                horizontalLineTo(19f)
                curveToRelative(1.663f, 0f, 3f, -1.338f, 3f, -3f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.662f, -1.337f, -3f, -3f, -3f)
                horizontalLineTo(5f)
                curveTo(3.338f, 3f, 2f, 4.338f, 2f, 6f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.662f, 1.338f, 3f, 3f, 3f)
                horizontalLineToRelative(2.513f)
                curveToRelative(0.3f, 0f, 0.587f, 0.137f, 0.774f, 0.375f)
                lineToRelative(2.925f, 3.65f)
                curveToRelative(0.4f, 0.5f, 1.163f, 0.5f, 1.563f, 0f)
                lineToRelative(2.925f, -3.65f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.775f, -0.375f)
                moveTo(7f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                moveToRelative(0f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
            }
        }.build()

        return _SiChatText!!
    }

@Suppress("ObjectPropertyName")
private var _SiChatText: ImageVector? = null
