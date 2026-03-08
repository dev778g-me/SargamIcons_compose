package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAISort: ImageVector
    get() {
        if (_SiAISort != null) {
            return _SiAISort!!
        }
        _SiAISort = ImageVector.Builder(
            name = "Filled.SiAISort",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.6f, 2f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4.6f)
                verticalLineToRelative(3.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.6f, 11f)
                horizontalLineToRelative(3.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8.4f)
                lineTo(11f, 4.6f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.4f, 2f)
                close()
                moveTo(15.6f, 2f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 4.6f)
                verticalLineToRelative(3.8f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 2.6f)
                horizontalLineToRelative(3.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 8.4f)
                lineTo(22f, 4.6f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.4f, 2f)
                close()
                moveTo(4.6f, 13f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 15.6f)
                verticalLineToRelative(3.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.6f, 22f)
                horizontalLineToRelative(3.8f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, -2.6f)
                verticalLineToRelative(-3.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.4f, 13f)
                close()
                moveTo(16.604f, 14.508f)
                curveToRelative(0.298f, -0.872f, 1.585f, -0.843f, 1.818f, 0.086f)
                lineToRelative(0.396f, 1.586f)
                lineToRelative(1.588f, 0.399f)
                curveToRelative(0.96f, 0.24f, 0.96f, 1.603f, 0f, 1.843f)
                lineToRelative(-1.588f, 0.396f)
                lineToRelative(-0.396f, 1.588f)
                curveToRelative(-0.24f, 0.96f, -1.603f, 0.96f, -1.843f, 0f)
                lineToRelative(-0.399f, -1.588f)
                lineToRelative(-1.586f, -0.396f)
                curveToRelative(-0.96f, -0.24f, -0.96f, -1.603f, 0f, -1.843f)
                lineToRelative(1.587f, -0.398f)
                lineToRelative(0.398f, -1.587f)
                close()
                moveTo(17.5f, 17.023f)
                arcToRelative(0.95f, 0.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.477f, 0.477f)
                arcToRelative(0.95f, 0.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.477f, 0.476f)
                arcToRelative(0.95f, 0.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.476f, -0.476f)
                arcToRelative(0.95f, 0.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.476f, -0.477f)
            }
        }.build()

        return _SiAISort!!
    }

@Suppress("ObjectPropertyName")
private var _SiAISort: ImageVector? = null
