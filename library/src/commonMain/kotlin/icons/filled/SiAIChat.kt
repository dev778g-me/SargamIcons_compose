package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAIChat: ImageVector
    get() {
        if (_SiAIChat != null) {
            return _SiAIChat!!
        }
        _SiAIChat = ImageVector.Builder(
            name = "Filled.SiAIChat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 10.797f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.204f, 0.203f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.204f, 0.202f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.796f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 10.797f)
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19f, 3f)
                curveToRelative(1.663f, 0f, 3f, 1.338f, 3f, 3f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.662f, -1.337f, 3f, -3f, 3f)
                horizontalLineToRelative(-2.525f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.775f, 0.375f)
                lineToRelative(-2.925f, 3.65f)
                curveToRelative(-0.4f, 0.5f, -1.162f, 0.5f, -1.562f, 0f)
                lineToRelative(-2.926f, -3.65f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.513f, 16f)
                horizontalLineTo(5f)
                curveToRelative(-1.662f, 0f, -3f, -1.338f, -3f, -3f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.662f, 1.338f, -3f, 3f, -3f)
                close()
                moveTo(9.922f, 8.594f)
                curveToRelative(-0.233f, -0.93f, -1.52f, -0.958f, -1.818f, -0.087f)
                lineToRelative(-0.025f, 0.087f)
                lineToRelative(-0.297f, 1.187f)
                lineToRelative(-1.187f, 0.297f)
                curveToRelative(-0.96f, 0.24f, -0.96f, 1.604f, 0f, 1.844f)
                lineToRelative(1.187f, 0.297f)
                lineToRelative(0.297f, 1.187f)
                curveToRelative(0.24f, 0.959f, 1.603f, 0.959f, 1.843f, 0f)
                lineToRelative(0.297f, -1.187f)
                lineToRelative(1.187f, -0.297f)
                curveToRelative(0.96f, -0.24f, 0.96f, -1.604f, 0f, -1.844f)
                lineToRelative(-1.187f, -0.297f)
                close()
                moveTo(15.5f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.727f, 0.568f)
                lineTo(14.48f, 6.98f)
                lineToRelative(-1.163f, 0.292f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.456f)
                lineToRelative(1.163f, 0.29f)
                lineToRelative(0.292f, 1.164f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.454f, 0f)
                lineToRelative(0.292f, -1.163f)
                lineToRelative(1.164f, -0.291f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.456f)
                lineToRelative(-1.164f, -0.292f)
                lineToRelative(-0.291f, -1.162f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.728f, -0.568f)
            }
        }.build()

        return _SiAIChat!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIChat: ImageVector? = null
